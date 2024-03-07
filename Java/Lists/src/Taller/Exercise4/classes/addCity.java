package Taller.Exercise4.classes;

import javax.swing.*;
import java.util.ArrayList;

public class addCity {
    public ArrayList<String> add(ArrayList<String> itinerary) {
        itinerary.add(JOptionPane.showInputDialog(null, "Ingrese la ciudad que quiere visitar "));
        JOptionPane.showMessageDialog(null, "Ciudad registrada exitosamente");
        return itinerary;
    }
}
