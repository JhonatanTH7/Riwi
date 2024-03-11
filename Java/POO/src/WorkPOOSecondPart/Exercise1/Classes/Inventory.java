package WorkPOOSecondPart.Exercise1.Classes;

import javax.swing.*;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productsList;

    public Inventory() {
        this.productsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productsList.add(product);
    }

    public boolean deleteProduct(int id) {
        return this.productsList.removeIf(product -> product.getId() == id);
    }

    public void showProducts() {
        String listToConcat = "";
        for (Product product : this.productsList) {
            listToConcat += "ID: " + product.getId() + "\n" +
                    "Name: " + product.getName() + "\n" +
                    "Price: " + product.getPrice() + "\n\n";

        }
        JOptionPane.showMessageDialog(null, listToConcat);
    }

    public Product searchByName(String searchedName) {
        for (Product product : this.productsList) {
            if (product.getName().equalsIgnoreCase(searchedName)) {
                return product;
            }
        }
        return null;
    }
}
