package Works.Exercise.model;

import java.util.List;

import Works.Exercise.database.CRUD;

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

}
