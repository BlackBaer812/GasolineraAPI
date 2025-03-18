package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.Producto;
import com.mrc.gasolinera.Service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProducto productoService;

    @GetMapping("/producto/lista")
    public List<Producto> listarProducto() {
        return productoService.getProductos();
    }

    @GetMapping("/producto/buscar/{id}")
    public Producto buscarProducto(@PathVariable long id) {
        return productoService.buscarProducto(id);
    }

    @PostMapping("/producto/crear")
    public String crearProducto(@RequestBody Producto producto) {
        productoService.agregarProducto(producto);

        return "Producto creado correctamente";
    }

    @DeleteMapping("/producto/borrar/{id}")
    public String borrarProducto(@PathVariable long id) {
        productoService.eliminarProducto(productoService.buscarProducto(id));

        return "Producto borrado correctamente";
    }

    @PutMapping("/producto/editar")
    public Producto editarProducto(@RequestBody Producto producto) {
        Producto p = productoService.buscarProducto(producto.getId());

        if(producto.getId() != null)p.setId(producto.getId());
        if(producto.getNombre() != null)p.setNombre(producto.getNombre());
        if(producto.getDescripcion() != null)p.setDescripcion(producto.getDescripcion());
        if(producto.getTipo() != null)p.setTipo(producto.getTipo());

        productoService.editarProducto(p);

        return productoService.buscarProducto(p.getId());
    }

}
