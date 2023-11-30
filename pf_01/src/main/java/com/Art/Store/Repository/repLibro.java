package com.Art.Store.Repository;

import com.Art.Store.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repLibro extends JpaRepository<Libro, Integer> {
}
