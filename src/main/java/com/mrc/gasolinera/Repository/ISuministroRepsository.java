package com.mrc.gasolinera.Repository;

import com.mrc.gasolinera.Modelo.Suministro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuministroRepsository extends JpaRepository<Suministro,Long> {
}
