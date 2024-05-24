package objetos_noche.cfp35.tp2_ivan.test;

import objetos_noche.cfp35.tp2_ivan.entities.Auto;


public class TestAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Chery","Tiggo5",5,14500f);

        System.out.println("--- Prueba Clase Auto ---");
        System.out.println(auto1.toString());
    }
}
