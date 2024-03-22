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
        Connection objConnection = ConfigDB.openConnection();
        Book objBook = (Book) object;
        String sql = "INSERT INTO books(title, publicationYear, price, idAuthor)VALUES(?,?,?,?);";
        try {
            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            objPreparedStatement.setString(1, objBook.getTitle());
            objPreparedStatement.setInt(2, objBook.getPublicationYear());
            objPreparedStatement.setDouble(3, objBook.getPrice());
            objPreparedStatement.setInt(4, objBook.getIdAuthor());
            objPreparedStatement.execute();
            ResultSet objResultSet = objPreparedStatement.getGeneratedKeys();
            while (objResultSet.next()) {
                objBook.setId(objResultSet.getInt(1));
            }
            objPreparedStatement.close();
            JOptionPane.showMessageDialog(null, "Book added successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        ConfigDB.closeConnection();
        return objBook;
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
        Connection objConnection = ConfigDB.openConnection();
        List<Object> booksList = new ArrayList<>();
        String sql = "SELECT * FROM books ORDER BY books.id ASC;";
        try {
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);
            ResultSet objResultSet = (ResultSet) objPreparedStatement.executeQuery();
            while (objResultSet.next()) {
                Book objBook = new Book();
                objBook.setId(objResultSet.getInt("id"));
                objBook.setTitle(objResultSet.getString("title"));
                objBook.setPublicationYear(objResultSet.getInt("publicationYear"));
                objBook.setPrice(objResultSet.getDouble("price"));
                objBook.setIdAuthor(objResultSet.getInt("idAuthor"));
                booksList.add(objBook);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        ConfigDB.closeConnection();
        return booksList;
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public ArrayList<Book> findByName(String name) {
        Connection objConnection = ConfigDB.openConnection();
        Book objBook = null;
        String sql = "SELECT * FROM books WHERE books.title LIKE ?;";
        ArrayList<Book> booksList = new ArrayList<>();
        try {
            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql);
            objPreparedStatement.setString(1, "%" + name + "%");
            ResultSet objResultSet = objPreparedStatement.executeQuery();
            while (objResultSet.next()) {
                objBook = new Book();
                objBook.setId(objResultSet.getInt("id"));
                objBook.setTitle(objResultSet.getString("title"));
                objBook.setPublicationYear(objResultSet.getInt("publicationYear"));
                objBook.setPrice(objResultSet.getDouble("price"));
                objBook.setIdAuthor(objResultSet.getInt("idAuthor"));
                booksList.add(objBook);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        ConfigDB.closeConnection();
        return booksList;
    }
}
