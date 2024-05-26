package objetos_noche.cfp35.tp2_ivan.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import objetos_noche.cfp35.tp2_ivan.connectors.Connector;
import objetos_noche.cfp35.tp2_ivan.entities.Moto;

public class MotoRepository {
    private Connection conn = Connector.getConnection();

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Moto> getAllMotos(){
        List<Moto> list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM motos")){
            while (rs.next()) {
                list.add(new Moto(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getInt("cilindrada"),
                    rs.getFloat("precio")
                ));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<Moto> motosOrdenadas(){
        List<Moto> list = getAllMotos();
        Collections.sort(list);
        return list;
    }
}
