package com.Art.Store.Repository;

import com.Art.Store.Entity.Cuadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repCuadro extends JpaRepository<Cuadro, Integer> {
}
