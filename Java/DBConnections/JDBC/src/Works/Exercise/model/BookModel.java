package Works.Exercise.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Works.Exercise.database.CRUD;
import Works.Exercise.database.ConfigDB;
import Works.Exercise.entity.Book;

import javax.swing.*;

public class BookModel implements CRUD {

    @Override
    public Object insert(Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public boolean update(Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public ArrayList<Book> findByName(String name) {
        Connection objConnection = ConfigDB.openConnection();
        Book objBook = null;
        String sql = "SELECT * FROM books WHERE books.name LIKE ?;";
        ArrayList<Book> codersList = new ArrayList<>();
        try {
            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql);
            objPreparedStatement.setString(1, "%" + name + "%");
            ResultSet objResult = objPreparedStatement.executeQuery();
            while (objResult.next()) {
                objBook = new Book();
                objBook.setId(objResult.getInt("id"));
                objBook.setTitle(objResult.getString("name"));
                objBook.setPublicationYear(objResult.getInt("publicationYear"));
                objBook.setPrice(objResult.getDouble("price"));
                codersList.add(objBook);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        // 7. Cerrar conexión
        ConfigDB.closeConnection();
        return codersList;
    }
}
