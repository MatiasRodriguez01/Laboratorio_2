package Clase2;

public class main {
    public static void main(String[] args) {

        Auto v1 = new Auto("Matias", 4 ,5, true);
        Camion v2 = new Camion("Rodrigo", 4, 2, 600);

        System.out.println("Auto: ");
        v1.caracteristicas();
        System.out.println("-----");
        System.out.println("Camion:");
        v2.caracteristicas();

    }
}
