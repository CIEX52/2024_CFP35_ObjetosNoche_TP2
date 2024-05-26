package objetos_noche.cfp35.tp2_ivan.entities;

import lombok.Getter;


@Getter
public class Auto extends Vehiculo {
    private int puertas;
    
    public Auto(int id, String marca, String modelo, int puertas, Float precio) {
        super(id, marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "+"Puertas: "+this.getPuertas()+" // "+"Precio: $"+this.getPrecio();
    }
}
