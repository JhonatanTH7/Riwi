package Works.Exercise.entity;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private Date releaseDate;
    private double price;

    public Book() {
    }

    public Book(int id, String name, Date releaseDate, double price) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", releaseDate=" + releaseDate + ", price=" + price + '}';
    }
}
