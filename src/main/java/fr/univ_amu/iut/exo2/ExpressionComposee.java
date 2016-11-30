package fr.univ_amu.iut.exo2;

public class ExpressionComposee extends Expression {

    private Expression fg, fd;
    private String operande;

    public ExpressionComposee(Expression fg, Expression fd, String operande) {
        this.fg = fg;
        this.fd = fd;
        this.operande = operande;
    }

    public double calculer() {
        switch (operande) {
            case "+":
                return fg.calculer() + fd.calculer();
            case "-":
                return fg.calculer() - fd.calculer();
            case "*":
                return fg.calculer() * fd.calculer();
            case "/":
                if (fd.calculer() == 0) throw new IllegalArgumentException("Diviseur égal 0");
                return fg.calculer() / fd.calculer();
        }
        throw new IllegalArgumentException("Signe d'opération non-existant");
    }

    @Override
    public String toString() {
        return "(" + fg + operande + fd + ")";
    }
}
