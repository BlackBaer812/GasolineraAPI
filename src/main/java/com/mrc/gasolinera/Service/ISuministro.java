package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Suministro;

import java.util.List;

public interface ISuministro {

    public List<Suministro> obtenerSuministros();

    public void agregarSuministro(Suministro suministro);

    public void eliminarSuministro(Suministro suministro);

    public Suministro obtenerSuministro(Long id);

    public void editarSuministro(Suministro suministro);

}
