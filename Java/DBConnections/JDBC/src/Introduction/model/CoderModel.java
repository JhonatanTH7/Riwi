package Introduction.model;

import Introduction.database.CRUD;
import Introduction.database.ConfigDB;
import Introduction.entity.Coder;
import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {
    @Override
    public Object insert(Object object) {
        //1. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();

        //2. Castear el objeto
        Coder objCoder = (Coder) object;

        try {
            //3. Crear el SQL
            String sql = "INSERT INTO coder(name,age,clan)VALUES(?,?,?);";

            //4. Preparamos el statement
            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //5. Asignar los ?
            objPrepare.setString(1, objCoder.getName());
            objPrepare.setInt(2, objCoder.getAge());
            objPrepare.setString(3, objCoder.getClan());

            //6. Ejecutamos el Query
            objPrepare.execute();

            //7. Obtener el resultado
            ResultSet objResult = objPrepare.getGeneratedKeys();
            while (objResult.next()) {
                objCoder.setId(objResult.getInt(1));
            }

            //8. Cerramos el prepareStatement
            objPrepare.close();
            JOptionPane.showMessageDialog(null, "Coder added successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error >> Couldn't add the Coder >> " + e.getMessage());
        }
        //9. Cerrar la conexión
        ConfigDB.closeConnection();
        return objCoder;
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
        //1. Abrir conexión
        Connection objConnection = ConfigDB.openConnection();

        //2. Inicializar la lista donde se guardan los registros que
        // devuelve la BD
        List<Object> codersList = new ArrayList<>();

        try {
            //3. Escribir la secuencia SQL
            String sql = "SELECT * FROM coder ORDER BY coder.id ASC;";

            //4. Utilizar PrepareStatement para preparalo
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //5. Ejecutar el Query o Prepare (Devuelve un tipo ResultSet)
            ResultSet objResult = (ResultSet) objPreparedStatement.executeQuery();

            //6. Obtener los resultados
            while (objResult.next()) {
                //Instancia del objeto que vamos a usar
                Coder objCoder = new Coder();

                //Asignamos valores al objeto
                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));

                //Finalmente, agregamos el objeto a la lista de elementos
                codersList.add(objCoder);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data acquisition error");
        }

        //7. Cerramos la conexión
        ConfigDB.closeConnection();

        //8. Retornamos lista de elementos
        return codersList;
    }

    @Override
    public Object findById(int id) {
        return null;
    }
}
