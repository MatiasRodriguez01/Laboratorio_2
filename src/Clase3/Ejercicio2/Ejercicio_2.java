package Clase3.Ejercicio2;
import java.util.*;

public class Ejercicio_2 {
    public static void main(String[] args) {

        /// ArrayList;
        ArrayList<Animal> animales = new ArrayList<>();

        /// Objets;
        Perro a1 = new Perro("Greta", 7, "Hembra", "Dogo");
        Gato a2 = new Gato("Jóhnson", 5, "Macho", "Negro");
        Pajaro a3 = new Pajaro("Richárlson", 4, "Macho", "Paloma");

        /// Agregar objetos a la lista;
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);

        /// mostrar los sonidos y informacion;
        caracteristicas(animales);
    }

    public static void caracteristicas(ArrayList<Animal> animales){
        for (Animal animal : animales){
            if (animal instanceof Perro){
                System.out.println("PERRO:");
                animal.caracteristicas();
                System.out.println("--");
                System.out.print("sonido: ");
                animal.hacerSonido();
            } else if (animal instanceof Gato) {
                System.out.println("GATO:");
                animal.caracteristicas();
                System.out.println("--");
                System.out.print("sonido: ");
                animal.hacerSonido();
            } else if (animal instanceof Pajaro){
                System.out.println("PAJARO:");
                animal.caracteristicas();
                System.out.println("--");
                System.out.print("sonido: ");
                animal.hacerSonido();
            }
            System.out.println("-----------------------");
        }
    }

}
