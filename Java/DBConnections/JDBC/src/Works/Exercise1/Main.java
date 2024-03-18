package Works.Exercise1;

import Works.Exercise1.database.ConfigDB;

public class Main {
    public static void main(String[] args) {
        ConfigDB configDB = new ConfigDB();
        configDB.openConnection();
    }
}
