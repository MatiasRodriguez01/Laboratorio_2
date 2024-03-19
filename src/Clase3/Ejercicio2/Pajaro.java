package Clase3.Ejercicio2;

public class Pajaro extends Animal{

    /// Attributes;
    private String especie;

    /// Constructs;
    public Pajaro() {}

    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    /// Getters and Setters;
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /// Metodos;
    @Override
    public void caracteristicas() {
        System.out.println("El nombre del animal es " + getNombre() + ".");
        System.out.println("La edad del animal es " + getEdad() + " Años.");
        System.out.println("La especie del pajaro es " + this.especie + ".");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta!!");
    }

}
