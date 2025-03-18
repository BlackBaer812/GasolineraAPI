package com.mrc.gasolinera.Repository;

import com.mrc.gasolinera.Modelo.Surtidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISurtidorRepository extends JpaRepository<Surtidor, Long> {
}
