package fr.univ_amu.iut.exo1;

import fr.univ_amu.iut.exo1.exceptions.WhatTheFuckException;

import java.util.Iterator;

public class ArbreBinaire <T> {
    private ArbreBinaire <T> fg, fd, pere;
    private T contenu;

    public ArbreBinaire<T> getFg() {
        return fg;
    }

    public ArbreBinaire<T> getFd() {
        return fd;
    }

    public T getContenu() {
        return contenu;
    }

    public ArbreBinaire<T> getPere() {
        return pere;
    }

    public void setPere(ArbreBinaire<T> pere) {
        this.pere = pere;
    }

    /**
     * Fonction qui place le nœud courant en paramètre du fils passé en paramètre
     * @param a Fils à traiter
     */
    public void traiterFils(ArbreBinaire <T> a) {
        if (a != null)
            if (a.getPere() != null)
                throw new IllegalArgumentException("A déjà un père.");
            else if (a == this)
                throw new WhatTheFuckException();
            else
                a.setPere(this);

    }

    @Override
    public String toString() {
        return contenu.toString();
    }

    /**
     * Constructeur de l'arbre binaire
     * @param fg Fils de gauche de l'arbre
     * @param fd Fils de droite de l'arbre
     * @param contenu Contenu du nœud
     */
    public ArbreBinaire (ArbreBinaire <T> fg, ArbreBinaire <T> fd, T contenu) {
        traiterFils(fg);
        traiterFils(fd);
        this.fg = fg;
        this.fd = fd;
        this.contenu = contenu;
    }
}
