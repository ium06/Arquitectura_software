package com.Art.Store.Repository;

import com.Art.Store.Entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoPelicula extends JpaRepository<Pelicula, Integer> {
}
