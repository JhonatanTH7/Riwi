import javax.swing.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
//        3. Sistema de Reservas: Desarrolla un programa para un teatro para gestionar las
//        reservas de asientos. El teatro tiene 5 filas con 10 asientos cada una. Utiliza un
//        arreglo bidimensional de boolean donde true representa un asiento ocupado y false
//        uno disponible. El sistema debe permitir:
//        - Reservar y cancelar asientos.
//        - Mostrar los asientos disponibles.
//        - Contabilizar el total de asientos ocupados y disponibles.
        menu menu = new menu();
        boolean[][] listaAsientos = new boolean[5][10];
        Scanner read = new Scanner(System.in);
        int option = 0;
        do {
            menu.mostrar();
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese la fila (1-5)");
                    int fila = read.nextInt();
                    System.out.println("Ingrese el asiento (1-10)");
                    int asiento = read.nextInt();
                    if (!listaAsientos[fila][asiento]) {
                        listaAsientos[fila][asiento] = true;
                        System.out.println("Asiento reservado correctamente");
                    } else {
                        System.out.println("Oops! Este asiento ya se encuentra reservado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la fila (1-5)");
                    break;
                case 3:
                    System.out.println("Ingrese la fila (1-5)");
                    break;
                case 4:
                    System.out.println("Ingrese la fila (1-5)");
                    break;
            }
        } while (option != 5);
    }

}
