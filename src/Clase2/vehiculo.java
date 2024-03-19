package Clase2;

public abstract class vehiculo {

    ///Atributos:
    private String propietario;
    private int puertas;
    private int ruedas;

    ///Constructores:
    public vehiculo() {
    }
    public vehiculo(String propietario, int puertas, int ruedas) {
        this.propietario = propietario;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    ///Getters y setters:
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public abstract void caracteristicas();

}
