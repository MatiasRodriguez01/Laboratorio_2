package Clase3.Ejercicio1;

public abstract class Vehiculo {

    /// attributes;
    private String color;
    private int ruedas;

    /// constructors;
    public Vehiculo() {
    }
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    /// Getters and Setters;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public abstract void caracteristicas();
}
