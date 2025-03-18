package com.mrc.gasolinera.Repository;

import com.mrc.gasolinera.Modelo.SurtidorProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISurtidorProductoRepository extends JpaRepository<SurtidorProducto, Long> {
}
