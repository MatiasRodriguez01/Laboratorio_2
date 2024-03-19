package Clase4;

public class Oficial extends Operativo{

    /// Attributes;
    private String turno;

    /// Constructs;
    public Oficial(){};
    public Oficial(String nombre, int dni, String turno) {
        super(nombre, dni);
        this.turno = turno;
    }

    /// Getters and Setters;
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
