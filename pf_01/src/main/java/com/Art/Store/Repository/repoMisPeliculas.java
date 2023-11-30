package com.Art.Store.Repository;

import com.Art.Store.Entity.ListaPeliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoMisPeliculas extends JpaRepository <ListaPeliculas, Integer>{
}
