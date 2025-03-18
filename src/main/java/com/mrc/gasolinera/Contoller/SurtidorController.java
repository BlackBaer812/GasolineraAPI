package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.Surtidor;
import com.mrc.gasolinera.Service.ISurtidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurtidorController {

    @Autowired
    private ISurtidor surtidorService;

    @GetMapping("/surtidor/lista")
    public List<Surtidor> lista() {
        return surtidorService.obtenerSurtidores();
    }

    @GetMapping("/surtidor/buscar/{id}")
    public Surtidor buscar(@PathVariable long id) {
        return surtidorService.obtenerSurtidor(id);
    }

    @PostMapping("/surtidor/crear")
    public String crear(@RequestBody Surtidor surtidor) {
        surtidorService.crearSurtidor(surtidor);

        return "Surtidor creado correctamente";
    }

    @DeleteMapping("/surtidor/borrar/{id}")
    public String borrar(@PathVariable long id) {
        surtidorService.eliminarSurtidor(surtidorService.obtenerSurtidor(id));

        return "Surtidor eliminado correctamente";
    }


    @PutMapping("surtidor/editar")
    public Surtidor editar(@RequestBody Surtidor surtidor) {
        Surtidor s = surtidorService.obtenerSurtidor(surtidor.getId());

        if(surtidor.getId().equals(s.getId()) && surtidor.getId() != null) s.setId(surtidor.getId());
        if(Boolean.valueOf(surtidor.isActivo()) != null) s.setActivo(surtidor.isActivo());
        if(surtidor.getFechaInstalacion() != null) s.setFechaInstalacion(surtidor.getFechaInstalacion());
        if(surtidor.getCodigo() != null) s.setCodigo(surtidor.getCodigo());

        surtidorService.editarSurtidor(s);

        return surtidorService.obtenerSurtidor(s.getId());
    }
}
