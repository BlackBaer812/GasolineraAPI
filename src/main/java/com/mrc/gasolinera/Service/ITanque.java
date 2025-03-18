package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Tanque;

import java.util.List;

public interface ITanque {

    public List<Tanque> obtenerTanque();

    public void crearTanque(Tanque tanque);

    public void eliminarTanque(Tanque tanque);

    public Tanque obtenerTanque(Long id);

    public void editarTanque(Tanque tanque);
}
