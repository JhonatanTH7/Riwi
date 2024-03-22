package Works.Exercise.controller;

import java.util.List;

import javax.swing.JOptionPane;

import Works.Exercise.entity.Author;
import Works.Exercise.model.AuthorModel;

public class AuthorController {
    AuthorModel objAuthorModel;

    public AuthorController() {
        this.objAuthorModel = new AuthorModel();
    }

    public void create() {
        Author objAuthor = new Author();
        String name = JOptionPane.showInputDialog(null, "");
        String nationality = JOptionPane.showInputDialog(null, "");
        objAuthor.setName(name);
        objAuthor.setNationality(nationality);
        objAuthor = (Author) this.objAuthorModel.insert(objAuthor);
        JOptionPane.showMessageDialog(null, objAuthor.toString());
    }

    public void getAll() {
        String list = this.getAll(this.objAuthorModel.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll(List<Object> objectsList) {
        String list = "                           ==== Authors List ==== \n";
        for (Object obj : objectsList) {
            // Casteamos el tipo Object a tipo Coder
            Author objAuthor = (Author) obj;
            // Concatenamos la info
            list += "- ID: " + objAuthor.getId() + " Name: " + objAuthor.getName() + " Nationality: "
                    + objAuthor.getNationality() + "\n";
        }
        return list;
    }
}
