package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.Precio;
import com.mrc.gasolinera.Service.IPrecio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrecioController {

    @Autowired
    private IPrecio precioService;

    @GetMapping("/precio/lista")
    public List<Precio> listaPrecio() {
        return precioService.obtenerPrecios();
    }

    @GetMapping("/precio/buscar/{id}")
    public Precio buscarPrecio(@PathVariable long id) {
        return precioService.obtenerPrecio(id);
    }

    @PostMapping("/precio/crear")
    public String crearPrecio(@RequestBody Precio precio) {
        precioService.agregarPrecio(precio);

        return "Precio creado correctamente";
    }

    @DeleteMapping("/precio/borrar/{id}")
    public String borrarPrecio(@PathVariable long id) {
        precioService.eliminarPrecio(precioService.obtenerPrecio(id));

        return "Precio borrado correctamente";
    }

    @PutMapping("/precio/editar")
    public Precio editarPrecio(@RequestBody Precio precio) {
        Precio p = precioService.obtenerPrecio(precio.getId());

        if(precio.getId() != null)p.setId(precio.getId());
        if(precio.getFechaFin() != null)p.setFechaFin(precio.getFechaFin());
        if(precio.getFechaInicio() != null)p.setFechaIncio(precio.getFechaInicio());
        if(precio.getPrecioPorLitro() != null)p.setPrecioPorLitro(precio.getPrecioPorLitro());
        if(precio.getProducto() != null)p.setProducto(precio.getProducto());

        precioService.editarPrecio(p);

        return precioService.obtenerPrecio(p.getId());
    }
}
