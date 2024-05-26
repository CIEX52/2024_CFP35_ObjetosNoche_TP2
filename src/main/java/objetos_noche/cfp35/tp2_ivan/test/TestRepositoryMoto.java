package objetos_noche.cfp35.tp2_ivan.test;

import objetos_noche.cfp35.tp2_ivan.repositories.MotoRepository;

public class TestRepositoryMoto {
    public static void main(String[] args) {
        MotoRepository motoRepository = new MotoRepository();

        System.out.println("--- Prueba motoGetAll() ---");
        motoRepository.getAllMotos().forEach(System.out::println);
        System.out.println();

        System.out.println("--- Prueba compareTo() Ordenamiento natural ---");
        motoRepository.motosOrdenadas().forEach(System.out::println);
    }
}
