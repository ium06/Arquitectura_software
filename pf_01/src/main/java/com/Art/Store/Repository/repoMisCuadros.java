package com.Art.Store.Repository;

import com.Art.Store.Entity.ListaCuadros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoMisCuadros extends JpaRepository <ListaCuadros, Integer>{
}
