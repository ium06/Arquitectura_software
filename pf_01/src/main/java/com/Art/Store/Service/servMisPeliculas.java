package com.Art.Store.Service;

import com.Art.Store.Entity.ListaPeliculas;
import com.Art.Store.Repository.repoMisPeliculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servMisPeliculas {
    @Autowired
    private repoMisPeliculas miPeliculas;

    public void guardaMisPeliculas(ListaPeliculas pelicula){
        miPeliculas.save(pelicula);
    }

    public List<ListaPeliculas> getMisPelicula(){
        return miPeliculas.findAll();
    }

    public void deleteById(int id){
        miPeliculas.deleteById(id);
    }
}
