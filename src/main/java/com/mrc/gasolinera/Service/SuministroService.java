package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Suministro;
import com.mrc.gasolinera.Repository.ISuministroRepsository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuministroService implements ISuministro{


    @Autowired
    ISuministroRepsository suministroRepsository;

    @Override
    public List<Suministro> obtenerSuministros() {
        List<Suministro> listaSuministros = suministroRepsository.findAll();
        return listaSuministros;
    }

    @Override
    public void agregarSuministro(Suministro suministro) {
        suministroRepsository.save(suministro);
    }

    @Override
    public void eliminarSuministro(Suministro suministro) {
        suministroRepsository.delete(suministro);
    }

    @Override
    public Suministro obtenerSuministro(Long id) {
        return suministroRepsository.findById(id).orElse(null);
    }

    @Override
    public void editarSuministro(Suministro suministro) {
        suministroRepsository.save(suministro);
    }
}
