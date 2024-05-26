package objetos_noche.cfp35.tp2_ivan.test;

import objetos_noche.cfp35.tp2_ivan.repositories.VehiculosRepository;

public class TestRepositoryVehiculos {
    public static void main(String[] args) throws Throwable {
        VehiculosRepository vehiculosRepository = new VehiculosRepository();

        System.out.println();
        System.out.println("--- Prueba getAllVehiculos() ---");
        vehiculosRepository.getAllVehiculos().forEach(System.out::println);
        System.out.println();

        System.out.println("--- Prueba Odenamiento Natural compareTo(modelo, marca, precio) ---");
        vehiculosRepository.vehiculosOrdenados().forEach(System.out::println);
        System.out.println();

        System.out.println("--- Prueba getMasCaro() ---");
        System.out.println("Vehiculo más caro: "+vehiculosRepository.getMasCaro());
        System.out.println();

        System.out.println("--- Prueba getMasBarato() ---");
        System.out.println("Vehiculo más barato: "+vehiculosRepository.getMasBarato());
        System.out.println();

        System.out.println("--- Prueba getLikeModelo() ---");
        System.out.println("Vehículos que contiene en el modelo la letra 'Y':");
        vehiculosRepository.getLikeModelo("y").forEach(System.out::println);
        System.out.println();

        System.out.println("--- Prueba ordenarPorPrecio() ---");
        vehiculosRepository.ordenarPorPrecio().forEach(System.out::println);
        System.out.println();
    }
}
