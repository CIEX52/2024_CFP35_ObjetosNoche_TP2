package objetos_noche.cfp35.tp2_ivan.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo>{
    private int id;
    private String marca;
    private String modelo;
    private Float precio;


    // public abstract int compareTo(Vehiculo para);

    @Override
    public int compareTo(Vehiculo para) {
        String thisVehic = this.getMarca()+","+this.getModelo()+","+this.getPrecio();
        String paraVehic = para.getMarca()+","+para.getModelo()+","+this.getPrecio();
        return thisVehic.compareTo(paraVehic);
    }
}