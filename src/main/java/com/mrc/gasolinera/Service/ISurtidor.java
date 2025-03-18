package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Surtidor;

import java.util.List;

public interface ISurtidor {
    public List<Surtidor> obtenerSurtidores();

    public void crearSurtidor(Surtidor surtidor);

    public void eliminarSurtidor(Surtidor surtidor);

    public Surtidor obtenerSurtidor(Long id);

    public void editarSurtidor(Surtidor surtidor);

}
