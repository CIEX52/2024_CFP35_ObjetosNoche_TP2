package objetos_noche.cfp35.tp2_ivan.test;

import objetos_noche.cfp35.tp2_ivan.repositories.AutoRepository;


public class TestRepositoryAuto {
    public static void main(String[] args) {
        AutoRepository autoRepository = new AutoRepository();

        System.out.println("--- Prueba autoGetAll() ---");
        autoRepository.getAllAutos().forEach(System.out::println);
        System.out.println();

        System.out.println("--- Prueba compareTo() Ordenamiento natural ---");
        autoRepository.autosOrdenados().forEach(System.out::println);

    }
}
