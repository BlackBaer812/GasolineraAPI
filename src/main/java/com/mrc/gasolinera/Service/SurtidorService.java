package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Surtidor;
import com.mrc.gasolinera.Repository.ISurtidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurtidorService implements ISurtidor{

    @Autowired
    ISurtidorRepository surtidorRepository;

    @Override
    public List<Surtidor> obtenerSurtidores() {
        List<Surtidor> surtidores = surtidorRepository.findAll();
        return surtidores;
    }

    @Override
    public void crearSurtidor(Surtidor surtidor) {
        surtidorRepository.save(surtidor);
    }

    @Override
    public void eliminarSurtidor(Surtidor surtidor) {
        surtidorRepository.delete(surtidor);
    }

    @Override
    public Surtidor obtenerSurtidor(Long id) {
        return surtidorRepository.findById(id).orElse(null);
    }

    @Override
    public void editarSurtidor(Surtidor surtidor) {
        surtidorRepository.save(surtidor);
    }
}
