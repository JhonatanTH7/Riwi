package WorkPOOSecondPart.Exercise1.Classes;

public class SpecificProduct extends Product {
    /*    Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
        categoria o marca.*/
    private String branch;
    private String category;

    public SpecificProduct(int id, String name, double price, String category, String branch) {
        super(id, name, price);
        this.branch = branch;
        this.category = category;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SpecificProduct{" +
                "branch='" + branch + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
