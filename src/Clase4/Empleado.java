package Clase4;

public abstract class Empleado {

    /// Attributes;
    private String nombre;

    /// Constructs;
    public Empleado(){}
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    /// getters and setters;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// toString;
    @Override
    public String toString() {
        return ("El nombre del empleado es " + this.nombre);
    }
}
