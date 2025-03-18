package com.mrc.gasolinera.Repository;

import com.mrc.gasolinera.Modelo.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrecioRepository extends JpaRepository<Precio, Long> {
}
