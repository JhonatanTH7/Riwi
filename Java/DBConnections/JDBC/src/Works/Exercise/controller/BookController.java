package Works.Exercise.controller;

import Works.Exercise.entity.Book;
import Works.Exercise.model.BookModel;

import javax.swing.*;
import java.util.List;

public class BookController {
    BookModel objBookModel;

    public BookController() {
        this.objBookModel = new BookModel();
    }

    public void getAll() {
        String list = this.getAll(this.objBookModel.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll(List<Object> objectsList) {
        String list = "                             ==== Books List ==== \n";
        for (Object obj : objectsList) {
            Book objBook = (Book) obj;
            list += "- ID: " + objBook.getId() + " Publication year: " + objBook.getPublicationYear() + " Price: " + objBook.getPrice() + " ID Author: " + objBook.getIdAuthor() + "\n";
        }
        return list;
    }
}
