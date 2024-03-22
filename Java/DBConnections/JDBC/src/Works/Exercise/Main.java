package Works.Exercise;

import Works.Exercise.database.ConfigDB;

public class Main {
    public static void main(String[] args) {
        ConfigDB configDB = new ConfigDB();
        configDB.openConnection();
    }
}
