package Clase3.Ejercicio2;

public class Perro extends Animal{

    ///Attributes;
    private String raza;

    /// Constructs;
    public Perro() {}
    public Perro(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    /// Getters and Setters;
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /// Metodos;
    @Override
    public void caracteristicas() {
        System.out.println("El nombre del animal es " + getRaza() + ".");
        System.out.println("La edad del animal es de " + getEdad() + " Años.");
        System.out.println("La raza del perro es " + this.raza + ".");

    }

    @Override
    public void hacerSonido() {
        System.out.println("EL perro ladra!!");
    }
}
