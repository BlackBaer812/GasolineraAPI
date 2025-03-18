package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.SurtidorProducto;

import java.util.List;

public interface ISurtidorProducto {

    public List<SurtidorProducto> obtenerProductos();

    public void agregarProducto(SurtidorProducto producto);

    public void eliminarProducto(SurtidorProducto producto);

    public SurtidorProducto obtenerProducto(Long id);

    public void editarProducto(SurtidorProducto producto);

}
