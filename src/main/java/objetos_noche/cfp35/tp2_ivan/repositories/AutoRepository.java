package objetos_noche.cfp35.tp2_ivan.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import objetos_noche.cfp35.tp2_ivan.connectors.Connector;
import objetos_noche.cfp35.tp2_ivan.entities.Auto;

public class AutoRepository {
    private Connection conn = Connector.getConnection();

    /**
     * @return Devuelve una lista con todos los autos.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Auto> getAllAutos(){
        List<Auto> list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM autos")){
            while (rs.next()) {
                list.add(new Auto(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getInt("puertas"),
                    rs.getFloat("precio")
                ));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    /**
     * @return Devuelve una lista de todos los autos con ordenamiento natural empleando el método compareTo(marca, modelo, precio).
     */
    public List<Auto> autosOrdenados(){
        List<Auto> list = getAllAutos();
        Collections.sort(list);
        return list;
    }
}
