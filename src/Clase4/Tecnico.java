package Clase4;

public class Tecnico extends Operativo{

    /// Attribute;
    private String contacto;

    /// Constructs;
    public Tecnico(){};

    public String getContacto() {
        return contacto;
    }

    public Tecnico(String nombre, int dni, String contacto) {
        super(nombre, dni);
        this.contacto = contacto;
    }

    /// Getters and Setters;
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
