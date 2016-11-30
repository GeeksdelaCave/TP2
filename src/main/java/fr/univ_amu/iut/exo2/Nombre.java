package fr.univ_amu.iut.exo2;

public class Nombre extends Expression {
    private double nombre;

    public Nombre(double nombre) {
        this.nombre = nombre;
    }

    public double calculer() {
        return nombre;
    }

    @Override
    public String toString() {
        return "" + nombre;
    }
}
