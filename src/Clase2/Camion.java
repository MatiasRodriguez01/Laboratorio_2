package Clase2;

public class Camion extends vehiculo{

    //Atributos
    private float carga;

    //Constructors
    public Camion() {
    }

    public Camion(String propietario, int puertas, int ruedas, float carga) {
        super(propietario, puertas, ruedas);
        this.carga = carga;
    }


    ///Getters and setters
    public float getCarga() {
        return carga;
    }
    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Propietario: " + getPropietario());
        System.out.println("Puertas: " + getPuertas());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Carga: " + getCarga());
    }
}
