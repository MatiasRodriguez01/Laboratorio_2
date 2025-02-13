package Clase3.Ejercicio2;

public abstract class Animal {

    /// Attributes:
    private String nombre;
    private int edad;
    private String genero;

    /// Constructs;
    public Animal() {}
    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /// Getters and Setters;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    ///  metodos;
    public abstract void caracteristicas();

    public abstract void hacerSonido();
}
