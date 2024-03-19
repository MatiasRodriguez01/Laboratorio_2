package Clase3.Ejercicio1;

public class Camion extends Vehiculo {

    /// Attributes;
    private int carga;

    /// Constructs;
    public Camion() {
    }
    public Camion(String color, int ruedas, int carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    /// Getters and Setters;
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        System.out.println("El vehiculo es de color " + getColor() + ".");
        System.out.println("El vehiculo tiene " + getRuedas() + " ruedas.");
        System.out.println("La carga del camion es de " + this.carga + "Kg.");
    }
}
