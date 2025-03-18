package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.SurtidorProducto;
import com.mrc.gasolinera.Repository.ISurtidorProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurtidorProductoService implements ISurtidorProducto{

    @Autowired
    ISurtidorProductoRepository surtidorProductoRepository;

    @Override
    public List<SurtidorProducto> obtenerProductos() {
        List<SurtidorProducto> lista = surtidorProductoRepository.findAll();
        return lista;
    }

    @Override
    public void agregarProducto(SurtidorProducto producto) {
        surtidorProductoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(SurtidorProducto producto) {
        surtidorProductoRepository.delete(producto);
    }

    @Override
    public SurtidorProducto obtenerProducto(Long id) {
        return surtidorProductoRepository.findById(id).orElse(null);
    }

    @Override
    public void editarProducto(SurtidorProducto producto) {
        surtidorProductoRepository.save(producto);
    }
}
