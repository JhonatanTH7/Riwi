package Introduction.controller;

import Introduction.entity.Coder;
import Introduction.model.CoderModel;

import javax.swing.*;

public class CoderController {
    CoderModel objCoderModel;

    public CoderController() {
        //Crear una instancia del Model
        this.objCoderModel = new CoderModel();
    }

    //Método para listar los elementos (Coders)
    public void getAll() {
        //Definimos String para concatenar la info
        String list = "                             ==== Coders List ==== \n";
        //Iteramos sobre la lista que devuelve el método find all
        for (Object obj : this.objCoderModel.findAll()) {
            //Casteamos el tipo Object a tipo Coder
            Coder objCoder = (Coder) obj;
            //Concatenamos la info
            list += "- ID: " + objCoder.getId() + " Name: " + objCoder.getName() + " Age: " + objCoder.getAge() + " Clan: " + objCoder.getClan() + "\n";
        }

        //Imprimimos la lista
        JOptionPane.showMessageDialog(null, list);
    }
}
