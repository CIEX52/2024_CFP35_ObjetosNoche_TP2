package objetos_noche.cfp35.tp2_ivan.test;

import java.sql.ResultSet;

import objetos_noche.cfp35.tp2_ivan.connectors.Connector;

public class TestConnector {
    public static void main(String[] args) {
        try (ResultSet rs=Connector
                                    .getConnection()
                                    .createStatement()
                                    .executeQuery("select * from cursos")){
            if(rs.next()){
                System.out.println("Se conecto a "+rs.getString("titulo"));
            }else{
                System.out.println("No se pudo conectar a la BD");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se pudo conectar a la BD");
        }
    }
}
