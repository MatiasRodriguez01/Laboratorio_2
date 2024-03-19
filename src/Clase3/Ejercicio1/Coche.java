package Clase3.Ejercicio1;

public class Coche extends Vehiculo {
    /// Attributes;
    private int velocidad;
    private int cilindrada;

    /// constructors;
    public Coche(){};
    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    // Getters and Setters;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void caracteristicas() {
        System.out.println("El vehiculo es de color " + getColor() + ".");
        System.out.println("El vehiculo tiene " + getRuedas() + " ruedas.");
        System.out.println("El coche va a una velocidad de " + this.velocidad + "Km/h.");
        System.out.println("La cilindrada del coche es de " + this.velocidad + "CC.");
    }
}
