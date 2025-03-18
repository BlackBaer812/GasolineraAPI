package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Precio;
import com.mrc.gasolinera.Repository.IPrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioService implements IPrecio{

    @Autowired
    private IPrecioRepository precioRepository;

    @Override
    public List<Precio> obtenerPrecios() {

        List<Precio> precios = precioRepository.findAll();

        return precios;
    }

    @Override
    public void agregarPrecio(Precio precio) {
        precioRepository.save(precio);
    }

    @Override
    public void eliminarPrecio(Precio precio) {
        precioRepository.delete(precio);
    }

    @Override
    public Precio obtenerPrecio(Long id) {

        return precioRepository.findById(id).orElse(null);
    }

    @Override
    public void editarPrecio(Precio precio) {
        precioRepository.save(precio);
    }
}
