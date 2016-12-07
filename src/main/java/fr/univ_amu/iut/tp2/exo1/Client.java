package fr.univ_amu.iut.tp2.exo1;

public class Client {

    public static ArbreBinaire <String> feuille (String mot) {
        return new ArbreBinaire<String>(null, null, mot);
    }

    public static ArbreBinaire <String> noeudInterne(ArbreBinaire <String> a1, String mot, ArbreBinaire <String> a2) {
        return new ArbreBinaire<String>(a1, a2, mot);
    }

    public static void main(String[] args) {
        ArbreBinaire<String> monArbre = noeudInterne(noeudInterne(noeudInterne(feuille("1"), "2", noeudInterne(feuille("3"), "4", noeudInterne(null, "5", noeudInterne(null, "6", null)))), "7", null), "8", feuille("9"));

        IterateurArbreBinaire <String> iter = monArbre.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
