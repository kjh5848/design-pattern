package ex07;

import ex07.lib.DB;
import ex07.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oralceDB = factory.createDB(Driver.ORACLE); // DB, MaraiDB
        oralceDB.execute("select");

        DB mariaDB = factory.createDB(Driver.MARIA); // DB, MaraiDB
        mariaDB.execute("select");
    }
}