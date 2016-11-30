package fr.univ_amu.iut.exo1;

import java.util.Iterator;

public class IterateurArbreBinaire <T> implements Iterator <T> {

    private ArbreBinaire <T> suivant;

    public boolean hasNext() {
        return suivant != null;
    }

    public T next() {

        T resultat = suivant.getContenu();

        if (suivant.getFd() != null)
            suivant = getLePlusAGauche(suivant.getFd());
        else {
            ArbreBinaire<T> papa = suivant.getPere();
            ArbreBinaire<T> courant = suivant;

            while (papa != null && papa.getFd() == courant) {
                courant = papa;
                papa = courant.getPere();
            }

            suivant = papa;
        }

        return resultat;
    }

    public IterateurArbreBinaire(ArbreBinaire<T> arbre) {
        this.suivant = getLePlusAGauche(arbre);
    }

    public void remove() {
        throw new UnsupportedOperationException("Le fait de supprimer n'est pas encore implémenté.");
    }

    public ArbreBinaire <T> getLePlusAGauche(ArbreBinaire <T> arbreBinaire) {
        if (arbreBinaire.getFg() != null)
            return getLePlusAGauche(arbreBinaire.getFg());
        else
            return arbreBinaire;
    }
}

//fils droit du père égal au courant
//si oui : je remonte d'un niveau