package Clase3.Ejercicio1;

import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {

        /// ArrayList
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /// Objets;
        Coche v1 = new Coche("Gris", 4, 300, 2000);
        Bicicleta v2 = new Bicicleta("Negra", 2, "Urbana");
        Camion v3 = new Camion("Rojo", 4, 600);
        Motocicleta v4 = new Motocicleta("Blanca", 2, 250, 1200);

        /// Guardamos los objetos en el ArrayList;
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        /// Mostramos;
        catalogar1(vehiculos);

        int ruedas;
        System.out.print("Ingrese el numero de ruedas, para ver cuantos vehiculos contienen esas ruedas: ");
        ruedas = sc.nextInt();
        System.out.println("--");
        System.out.println("Se han encontrado [" + catalogar2(vehiculos, ruedas)  + "] vehículos con " + ruedas + " ruedas.");
    }

    public static void catalogar1(ArrayList<Vehiculo> vehiculos){
        for (Vehiculo vehiculo : vehiculos ){
            if (vehiculo instanceof Coche) {
                System.out.println("Coche:");
                vehiculo.caracteristicas();
            } else if (vehiculo instanceof Bicicleta) {
                System.out.println("Bicicleta:");
                vehiculo.caracteristicas();
            } else if (vehiculo instanceof Camion) {
                System.out.println("Camion:");
                vehiculo.caracteristicas();
            } else if (vehiculo instanceof Motocicleta) {
                System.out.println("Motocicleta:");
                vehiculo.caracteristicas();
            }
            System.out.println("------------");
        }
    }

    public static int catalogar2(ArrayList<Vehiculo> vehiculos, int ruedas){
        int cantRuedas = 0;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getRuedas() == ruedas){
                cantRuedas += 1;
            }
        }
        return cantRuedas;
    }
}

