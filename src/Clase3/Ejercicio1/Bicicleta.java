package Clase3.Ejercicio1;

public class Bicicleta extends Vehiculo {

    /// Attributes;
    private String tipo;

    /// constructors;

    public Bicicleta() {}
    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    /// Getters and Setters;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void caracteristicas() {
        System.out.println("El vehiculo es de color " + getColor() + ".");
        System.out.println("El vehiculo tiene " + getRuedas() + " ruedas.");
        System.out.println("EL tipo de bicicleta es " + this.tipo + ".");
    }
}
