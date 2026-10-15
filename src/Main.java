import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CUARTEL DE HEROES =====");

        // 1. Constructor por defecto
        Heroe recluta = new Heroe();
        recluta.presentarse();

        // 2. Constructor con datos leídos del teclado
        System.out.print("Nombre del nuevo heroe: ");
        String nombre = sc.nextLine();
        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Nivel de poder (entero): ");
        int poder = sc.nextInt();

        Heroe nuevo = new Heroe(nombre, origen, poder);
        nuevo.presentarse();

        // RETO 1: Uso de getNombre()
        System.out.println("El nombre del nuevo heroe obtenido con getNombre() es: " + nuevo.getNombre());

        // RETO 2: Tercer héroe propio
        Heroe miHeroe = new Heroe("Doctor Doom", "Latveria", 99);
        System.out.print("Tercer heroe: ");
        miHeroe.presentarse();

        sc.close();
    }
}