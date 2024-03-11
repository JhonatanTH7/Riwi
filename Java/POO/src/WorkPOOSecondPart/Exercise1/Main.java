package WorkPOOSecondPart.Exercise1;

import WorkPOOSecondPart.Exercise1.Classes.Inventory;
import WorkPOOSecondPart.Exercise1.Classes.Product;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
/*        Ejercicio 1: Sistema de Control de Inventarios
        Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
        encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.

        Principios de POO aplicados: Encapsulamiento, Herencia.

                Requisitos:

        Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
        precio. Implementa getters y setters para aplicar el encapsulamiento.
        Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
        categoria o marca.
                Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
        Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
        por nombre o categoría.*/
        Inventory objInventory = new Inventory();

        JOptionPane.showMessageDialog(null, "Products list");
        Product product1 = new Product(0, "Pencil", 2000);
        Product product2 = new Product(1, "Eraser", 800);
        Product product3 = new Product(2, "ErasableProduct", 0);
        objInventory.addProduct(product1);
        objInventory.addProduct(product2);
        objInventory.addProduct(product3);
        objInventory.showProducts();
        objInventory.deleteProduct(2);
        JOptionPane.showMessageDialog(null, "After deleting");
        objInventory.showProducts();
        JOptionPane.showMessageDialog(null, "After filtering by name");
        JOptionPane.showMessageDialog(null, objInventory.searchByName("Pencil"));
    }
}
