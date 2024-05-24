package objetos_noche.cfp35.tp2_ivan.connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    
    // MariaDB o MySQL 
    //private static String url="jdbc:mariadb://localhost:3306/colegio";

    // SQlite
    public static String url="jdbc:sqlite:./data/data";

    
    private static Connection conn=null;
    private Connector(){}

    public static Connection getConnection(){
        try {
            conn=DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
