package com.mrc.gasolinera.Service;

import com.mrc.gasolinera.Modelo.Tanque;
import com.mrc.gasolinera.Repository.ITanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TanqueService implements ITanque{

    @Autowired
    ITanqueRepository tanqueRepository;

    @Override
    public List<Tanque> obtenerTanque() {
        List<Tanque> tanques = tanqueRepository.findAll();
        return tanques;
    }

    @Override
    public void crearTanque(Tanque tanque) {
        tanqueRepository.save(tanque);
    }

    @Override
    public void eliminarTanque(Tanque tanque) {
        tanqueRepository.delete(tanque);
    }

    @Override
    public Tanque obtenerTanque(Long id) {
        return tanqueRepository.findById(id).orElse(null);
    }

    @Override
    public void editarTanque(Tanque tanque) {
        tanqueRepository.save(tanque);
    }
}
