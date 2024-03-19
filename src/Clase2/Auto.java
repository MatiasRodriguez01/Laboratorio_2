package Clase2;

public class Auto extends vehiculo {

    private boolean descapotable;

    public Auto() {}

    public Auto(String propietario, int puertas, int ruedas, boolean descapotable) {
        super(propietario, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas(){
        System.out.println("Propietario: " + getPropietario());
        System.out.println("Puertas: " + getPuertas());
        System.out.println("Ruedas: " + getRuedas());
        if(isDescapotable()){
            System.out.println("Es descapotable");
        }
    }
}
