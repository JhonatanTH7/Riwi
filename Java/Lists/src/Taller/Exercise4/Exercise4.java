package Taller.Exercise4;

import Taller.Exercise4.classes.addCity;
import Taller.Exercise4.classes.menuExercise4;
import Taller.Exercise4.classes.removeCity;
import Taller.Exercise4.classes.showCities;

import javax.swing.*;
import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
/*        4. Planificador de Viajes: Escribe un programa para ayudar a planificar viajes por
        carretera. Los usuarios pueden ingresar varias ciudades que planean visitar en
        orden. Utiliza un arreglo de String para almacenar las ciudades. El programa debe
        ser capaz de:
        - Añadir y remover ciudades del itinerario.
        - Mostrar la lista completa de ciudades a visitar.
        - (Opcional) Calcular la distancia total del viaje asumiendo distancias ficticias entre
            ciudades consecutivas.*/
        showCities show = new showCities();
        removeCity remove = new removeCity();
        addCity add = new addCity();
        menuExercise4 menu = new menuExercise4();
        ArrayList<String> itinerary = new ArrayList<>();
        int option = 0;
        do {
            try {
                option = menu.mostrar();
                switch (option) {
                    case 1:
                        itinerary = add.add(itinerary);
                        break;
                    case 2:
                        show.show(itinerary);
                        remove.remove(itinerary);
                        break;
                    case 3:
                        show.show(itinerary);
                        break;
                    case 4:
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caracteres invalidos");
            }
        } while (option != 5);
    }
}
