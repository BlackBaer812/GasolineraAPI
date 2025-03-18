package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.SurtidorProducto;
import com.mrc.gasolinera.Service.ISurtidorProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurtidorProductoController {

    @Autowired
    private ISurtidorProducto surtidorProductoService;

    @GetMapping("/surtprod/lista")
    public List<SurtidorProducto> lista() {
        return surtidorProductoService.obtenerProductos();
    }

    @GetMapping("/surtprod/buscar/{id}")
    public SurtidorProducto buscar(@PathVariable long id) {
        return surtidorProductoService.obtenerProducto(id);
    }

    @PostMapping("/surtprod/crear")
    public String crear(@RequestBody SurtidorProducto producto) {
        surtidorProductoService.agregarProducto(producto);

        return "Se ha agregado correctamente";
    }

    @DeleteMapping("/surtprod/eliminar/{id}")
    public String eliminar(@PathVariable long id) {
        surtidorProductoService.eliminarProducto(surtidorProductoService.obtenerProducto(id));

        return "Se ha eliminado correctamente";
    }

    @PutMapping("/surtprod/editar")
    public SurtidorProducto editar(@RequestBody SurtidorProducto producto) {

        SurtidorProducto sp = surtidorProductoService.obtenerProducto(producto.getId());

        if(producto.getId() != sp.getId() && producto.getId() != null)sp.setId(producto.getId());
        if(producto.getProducto() != null)sp.setProducto(producto.getProducto());
        if(producto.getSurtidor() != null)sp.setSurtidor(producto.getSurtidor());
        
        surtidorProductoService.editarProducto(sp);

        return surtidorProductoService.obtenerProducto(sp.getId());
    }
}
