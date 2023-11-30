package com.Art.Store.Repository;

import com.Art.Store.Entity.ListaLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoMisLibros extends JpaRepository <ListaLibros, Integer>{
}
