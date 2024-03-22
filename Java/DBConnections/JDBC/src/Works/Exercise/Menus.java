package Works.Exercise;

import javax.swing.JOptionPane;

import Works.Exercise.controller.AuthorController;

public class Menus {
    public void authorMenu() {
        AuthorController authorController = new AuthorController();
        String option2 = "";
        do {
            option2 = JOptionPane.showInputDialog(null, """

                        AUTHORS MENU

                    1. Show all Authors
                    2. Add Author
                    3. Update Author
                    4. Delete Author
                    5. Get Author by ID
                    6. Exit

                    Choose an option:

                    """);
            switch (option2) {
                case "1":
                    authorController.getAll();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Going back to main menu");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Not a valid option");
                    break;
            }
        } while (!option2.equals("6"));
    }

    public void bookMenu() {
        String option2 = "";
        do {
            option2 = JOptionPane.showInputDialog(null, """

                        BOOKS MENU

                    1. Show all Books
                    2. Add Book
                    3. Update Book
                    4. Delete Book
                    5. Get Book by ID
                    6. Get Book by Author
                    7. Get Book by Title
                    8. Exit

                    Choose an option:

                    """);
            switch (option2) {
                case "1":
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Going back to main menu");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Not a valid option");
                    break;
            }
        } while (!option2.equals("8"));
    }
}
