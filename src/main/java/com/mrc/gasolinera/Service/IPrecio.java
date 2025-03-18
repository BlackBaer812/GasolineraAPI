package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Precio;

import java.util.List;

public interface IPrecio {

    public List<Precio> obtenerPrecios();

    public void agregarPrecio(Precio precio);

    public void eliminarPrecio(Precio precio);

    public Precio obtenerPrecio(Long id);

    public void editarPrecio(Precio precio);

}
