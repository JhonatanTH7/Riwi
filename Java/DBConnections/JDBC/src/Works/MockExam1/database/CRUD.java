package Works.MockExam1.database;

import java.util.List;

public interface CRUD {
    public Object insert(Object object);

    public boolean update(Object object);

    public boolean delete(Object object);

    public List<Object> findAll();
}
