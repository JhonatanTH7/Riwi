package Works.Exercise.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Works.Exercise.database.CRUD;
import Works.Exercise.database.ConfigDB;
import Works.Exercise.entity.Author;

public class AuthorModel implements CRUD {

    @Override
    public Object insert(Object object) {
        Connection objConnection = ConfigDB.openConnection();
        Author objAuthor = new Author();
        String sql = "INSERT INTO authors(name,nationality)VALUES(?,?)";
        try {
            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            objPreparedStatement.setString(1, objAuthor.getName());
            objPreparedStatement.setString(2, objAuthor.getNationality());
            objPreparedStatement.execute();
            ResultSet objResultSet = objPreparedStatement.getGeneratedKeys();
            while (objResultSet.next()) {
                objAuthor.setId(objResultSet.getInt(1));
            }
            objPreparedStatement.close();
            JOptionPane.showMessageDialog(null, "Author added successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        ConfigDB.closeConnection();
        return objAuthor;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;

    }

    @Override
    public List<Object> findAll() {
        Connection objConnection = ConfigDB.openConnection();
        List<Object> auhtorsList = new ArrayList<>();
        String sql = "SELECT * FROM authors ORDER BY authors.id ASC;";
        try {
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);
            ResultSet objResultSet = (ResultSet) objPreparedStatement.executeQuery();
            while (objResultSet.next()) {
                Author objAuthor = new Author();
                objAuthor.setId(objResultSet.getInt("id"));
                objAuthor.setName(objResultSet.getString("name"));
                objAuthor.setNationality(objResultSet.getString("nationality"));
                auhtorsList.add(objAuthor);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        ConfigDB.closeConnection();
        return auhtorsList;
    }

    @Override
    public Object findById(int id) {
        return 0;
    }
}
