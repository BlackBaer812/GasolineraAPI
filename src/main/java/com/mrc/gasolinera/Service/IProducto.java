package com.mrc.gasolinera.Service;


import com.mrc.gasolinera.Modelo.Producto;

import java.util.List;

public interface IProducto {
    public List<Producto> getProductos();

    public void agregarProducto(Producto producto);

    public void eliminarProducto(Producto producto);

    public Producto buscarProducto(Long id);

    public void editarProducto(Producto producto);
}
