package com.mrc.gasolinera.Contoller;

import com.mrc.gasolinera.Modelo.Suministro;
import com.mrc.gasolinera.Service.ISuministro;
import com.mrc.gasolinera.Service.SuministroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SuministrosController {

    @Autowired
    ISuministro suministroService;

    @GetMapping("/suministro/lista")
    public List<Suministro> listaSuministros(){
        return suministroService.obtenerSuministros();
    }

    @GetMapping("/suministro/buscar/{id}")
    public Suministro buscarSuministros(@PathVariable long id){
        return suministroService.obtenerSuministro(id);
    }

    @PostMapping("/suministro/crear")
    public String crearSuministro(@RequestBody Suministro suministro){
        suministroService.agregarSuministro(suministro);

        return "Suministro creado correctamente";
    }

    @DeleteMapping("/suministro/borrar/{id}")
    public String eliminarSuministros(@PathVariable long id){
        suministroService.eliminarSuministro(this.suministroService.obtenerSuministro(id));

        return "Suministro eliminado correctamente";
    }

    @PutMapping("/suministro/editar")
    public Suministro editarSuministro(@RequestBody Suministro suministro){
        Suministro s = suministroService.obtenerSuministro(suministro.getId());

        if(suministro.getId() != null)s.setId(suministro.getId());
        if(suministro.getFechaHora() != null)s.setFechaHora(suministro.getFechaHora());
        if(suministro.getProducto() != null)s.setProducto(suministro.getProducto());
        if(suministro.getSurtidor() != null)s.setSurtidor(suministro.getSurtidor());
        if(suministro.getImporteLitros() != null)s.setImporteLitros(suministro.getImporteLitros());
        if(suministro.getVolumenLitros() != null)s.setVolumenLitros(suministro.getVolumenLitros());

        suministroService.editarSuministro(s);

        return suministroService.obtenerSuministro(s.getId());
    }

}
