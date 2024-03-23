package Works.Exercise.controller;

import Works.Exercise.entity.Book;
import Works.Exercise.model.BookModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BookController {
    BookModel objBookModel;

    public BookController() {
        this.objBookModel = new BookModel();
    }

    public void create() {
        AuthorController objAuthorController = new AuthorController();
        Book objBook = new Book();
        String title = JOptionPane.showInputDialog(null, "Enter the title of the book");
        int publicationYear = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Enter the year that the book was published"));
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of the book"));
        int idAuthor = Integer.parseInt(JOptionPane.showInputDialog(null, objAuthorController.getAllStringList() +
                "\nEnter the ID of the author that published the book, if he is not registered go to the authors menu and register him"));
        objBook.setTitle(title);
        objBook.setPublicationYear(publicationYear);
        objBook.setPrice(price);
        objBook.setIdAuthor(idAuthor);
        objBook = (Book) this.objBookModel.insert(objBook);
        JOptionPane.showMessageDialog(null, objBook.toString());
    }

    public void getByName() {
        String nameSearched = JOptionPane.showInputDialog(null, "Enter the title of the Book you want to search for");
        ArrayList<Book> listBooksSearched = this.objBookModel.findByName(nameSearched);

        String results = "           ====== Results ======\n\n";
        if (listBooksSearched != null) {
            for (Book objBook : listBooksSearched)
                results += "- ID: " + objBook.getId() + " Title: " + objBook.getTitle() + " Publication year: "
                        + objBook.getPublicationYear() + " Price: " + objBook.getPrice() + " ID Author: "
                        + objBook.getIdAuthor() + "\n";
        } else {
            results += "- There is not a Book with the name: " + nameSearched;
        }
        JOptionPane.showMessageDialog(null, results);
    }

    public void getAll() {
        String list = this.getAll(this.objBookModel.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll(List<Object> objectsList) {
        String list = "                             ==== Books List ==== \n";
        for (Object obj : objectsList) {
            Book objBook = (Book) obj;
            list += "- ID: " + objBook.getId() + " Title: " + objBook.getTitle() + " Publication year: "
                    + objBook.getPublicationYear() + " Price: " + objBook.getPrice() + " ID Author: "
                    + objBook.getIdAuthor() + "\n";
        }
        return list;
    }
}
