package com.mrc.gasolinera.Repository;

import com.mrc.gasolinera.Modelo.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITanqueRepository extends JpaRepository<Tanque, Long> {
}
