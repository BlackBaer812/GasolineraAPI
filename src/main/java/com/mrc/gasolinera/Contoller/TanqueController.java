package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.Tanque;
import com.mrc.gasolinera.Service.ITanque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TanqueController {

    @Autowired
    private ITanque tanqueService;

    @GetMapping("/tanque/lista")
    public List<Tanque> listaTanque() {
        return tanqueService.obtenerTanque();
    }

    @GetMapping("/tanque/buscar/{id}")
    public Tanque buscarTanque(@PathVariable long id) {
        return tanqueService.obtenerTanque(id);
    }

    @PostMapping("/tanque/crear")
    public String agregarTanque(@RequestBody Tanque tanque) {
        tanqueService.crearTanque(tanque);

        return "Tanque agregado correctamente";
    }

    @DeleteMapping("/tanque/borrar/{id}")
    public String borrarTanque(@PathVariable long id) {
        tanqueService.eliminarTanque(tanqueService.obtenerTanque(id));

        return "Tanque borrado correctamente";
    }

    @PutMapping("/tanque/editar")
    public Tanque editarTanque(@RequestBody Tanque tanque) {
        Tanque t = tanqueService.obtenerTanque(tanque.getId());

        if(tanque.getId() != t.getId() && tanque.getId() != null)t.setId(tanque.getId());
        if(tanque.getCodigo() != null) t.setCodigo(tanque.getCodigo());
        if(tanque.getCapacidadMaxima() != null)t.setCapacidadMaxima(tanque.getCapacidadMaxima());
        if(tanque.getProducto() != null) t.setProducto(tanque.getProducto());
        if(tanque.getCantidad() != null) t.setCantidad(tanque.getCantidad());

        tanqueService.editarTanque(t);

        return tanqueService.obtenerTanque(t.getId());
    }

}
