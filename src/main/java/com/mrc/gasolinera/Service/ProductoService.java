package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Producto;
import com.mrc.gasolinera.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService implements IProducto{

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos;
    }

    @Override
    public void agregarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public Producto buscarProducto(Long id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public void editarProducto(Producto producto) {
        productoRepository.save(producto);
    }
}
