package objetos_noche.cfp35.tp2_ivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import objetos_noche.cfp35.tp2_ivan.repositories.VehiculosRepository;

@SpringBootApplication
public class Tp2IvanApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Throwable {
		SpringApplication.run(Tp2IvanApplication.class, args);

		VehiculosRepository vehiculosRepository = new VehiculosRepository();

        System.out.println();
        System.out.println("--- LISTADO DE VEHÍCULOS ---");
        vehiculosRepository.getAllVehiculos().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("--- ORDENAMIENTO NATURAL compareTo(modelo, marca, precio) ---");
        vehiculosRepository.vehiculosOrdenados().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("VEHÍCULO MÁS CARO: ");
        System.out.println(vehiculosRepository.getMasCaro());
        System.out.println();
        System.out.println("VEHÍCULO MÁS BARATO: ");
        System.out.println(vehiculosRepository.getMasBarato());
        System.out.println();
        System.out.println("VEHÍCULOS QUE CONTIENEN EN EL MODELO LA LETRA 'Y':");
        vehiculosRepository.getLikeModelo("y").forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("--- LISTADO POR PRECIO DE MAYOR A MENOR ---");
        vehiculosRepository.ordenarPorPrecio().forEach(System.out::println);		
	}

}