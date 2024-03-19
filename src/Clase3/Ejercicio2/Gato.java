package Clase3.Ejercicio2;

public class Gato extends Animal {

    /// Attributes;
    private String color;

    /// Constructs;
    public Gato() {}
    public Gato(String nombre, int edad, String genero, String color) {
        super(nombre, edad, genero);
        this.color = color;
    }

    /// Getters and Setters;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /// Metodos;
    @Override
    public void caracteristicas() {
        System.out.println("El nombre del animal es " + getNombre() + ".");
        System.out.println("La edad del animal es " + getEdad() + " Años.");
        System.out.println("El color del gato es " + this.color + ".");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla!!");
    }
}
