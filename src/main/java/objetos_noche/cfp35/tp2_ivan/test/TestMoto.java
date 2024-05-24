package objetos_noche.cfp35.tp2_ivan.test;

import objetos_noche.cfp35.tp2_ivan.entities.Moto;

public class TestMoto {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Yamaha","FZ160V3",600,3900f);

        System.out.println("--- Prueba Moto ---");
        System.out.println(moto1.toString());
    }
}
