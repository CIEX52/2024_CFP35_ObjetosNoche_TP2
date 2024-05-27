package objetos_noche.cfp35.tp2_ivan.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;


import objetos_noche.cfp35.tp2_ivan.entities.Vehiculo;

public class VehiculosRepository {
    AutoRepository autoRepository = new AutoRepository();
    MotoRepository motoRepository = new MotoRepository();

    /**
     * @return Devuelve una lista con todos los vehículos.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List getAllVehiculos() {
        List vehiculos = new ArrayList();
        vehiculos.addAll(autoRepository.getAllAutos());
        vehiculos.addAll(motoRepository.getAllMotos());
        return vehiculos;
    }

    /**
     * @return Devuelve el vehículo de mayor precio.
     */
    @SuppressWarnings("unchecked")
    public Object getMasCaro() throws Throwable {
        return getAllVehiculos()
                                .stream()
                                .max(Comparator.comparing(Vehiculo::getPrecio))
                                .orElseThrow(NoSuchElementException::new);
    };

    /**
     * @return Devuelve el vehículo de menor precio.
     */
    @SuppressWarnings("unchecked")
    public Object getMasBarato() throws Throwable {
        return getAllVehiculos()
                                .stream()
                                .min(Comparator.comparing(Vehiculo::getPrecio))
                                .orElseThrow(NoSuchElementException::new);
    };

    /**
     * @param letra String (puede ser una o varias letras)
     * @return Devuelve una lista de vehículos con contengan en el modelo la/las letras pasadas como parámetro.
     */
    public List<Vehiculo> getLikeModelo(String letra){
        if (letra==null) return new ArrayList<Vehiculo>();
        List<Vehiculo> listLikeModelo = new ArrayList<Vehiculo>();
        listLikeModelo.addAll(
            autoRepository.getAllAutos()
                                        .stream()
                                        .filter(auto->auto.getModelo().toLowerCase().contains(letra))
                                        .toList()
        );
        listLikeModelo.addAll(
            motoRepository.getAllMotos()
                                        .stream()
                                        .filter(moto->moto.getModelo().toLowerCase().contains(letra))
                                        .toList()
        );
        return listLikeModelo;
    }

    /**
     * @return Devuelve una lista con todos los vehículos ordenada por precio de mayor a menor.
     */
    public List<Vehiculo> ordenarPorPrecio(){
        List<Vehiculo> list= vehiculosOrdenados()
                                                .stream()
                                                .sorted(Comparator.comparing(Vehiculo::getPrecio))
                                                .toList()
                                                .reversed();
        return list;
    }

    /**
     * @return Devuelve una lista de vehiculos con orden natural teniendo en cuenta los atributos (marca, modelo, precio).
     */
    @SuppressWarnings("unchecked")
    public List<Vehiculo> vehiculosOrdenados() {
        List<Vehiculo> list = getAllVehiculos();
        Collections.sort(list);
        return list;
    }
}
