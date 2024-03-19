package Clase4;

public class Operativo extends Empleado{

    /// Attributes;
    private int dni;

    /// Constructs;
    public Operativo(){};
    public Operativo(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    /// Getters and Setters;
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
