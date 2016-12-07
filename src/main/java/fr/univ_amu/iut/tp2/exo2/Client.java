package fr.univ_amu.iut.tp2.exo2;

public class Client {

    public static void main(String[] args) {
        Expression calcul = new ExpressionComposee(new ExpressionComposee(new Nombre(2), new Nombre(3), '-'), new Nombre(5), '*');
        System.out.println(calcul);
        System.out.println(calcul.calculer());

        System.out.println();

        calcul = new ExpressionComposee(new ExpressionComposee(new Nombre(3), new Nombre(4), '*'), new Nombre(6), '+');
        System.out.println(calcul);
        System.out.println(calcul.calculer());
    }

}
