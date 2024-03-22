package Works.Exercise.entity;

import java.util.Date;

public class Book extends Author {
    private int id;
    private String title;
    private Date releaseDate;
    private double price;

    private int idAuthor;

    public Book() {
    }

    public Book(int id, String title, Date releaseDate, double price, int idAuthor) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
        this.idAuthor = idAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", releaseDate=" + releaseDate + ", price=" + price + '}';
    }
}
