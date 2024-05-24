package objetos_noche.cfp35.tp2_ivan.entities;

import lombok.Getter;


@Getter
public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String marca, String modelo, int cilindrada, Float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "+"Cilindrada: "+this.getCilindrada()+"cc "+" // "+"Precio: $"+this.getPrecio();
    }
}
