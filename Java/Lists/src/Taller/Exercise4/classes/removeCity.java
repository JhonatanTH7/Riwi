package Taller.Exercise4.classes;

import javax.swing.*;
import java.util.ArrayList;

public class removeCity {
    public void remove(ArrayList<String> itinerary) {
        String selectedCity = JOptionPane.showInputDialog(null, "Ingrese la ciudad a eliminar del itinerario");
        JOptionPane.showMessageDialog(null, itinerary.remove(selectedCity));
    }
}
