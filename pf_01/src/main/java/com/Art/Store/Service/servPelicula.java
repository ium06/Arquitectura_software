package com.Art.Store.Service;

import com.Art.Store.Entity.Pelicula;
import com.Art.Store.Repository.repoPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servPelicula{

    @Autowired
    private repoPelicula rPelicula;
    public void save(Pelicula pelicula){
        rPelicula.save(pelicula);
    }

    public List<Pelicula> getAllPelicula(){
        return rPelicula.findAll();
    }

    public Pelicula getPeliculaById(int id){
        return rPelicula.findById(id).get();
    }

    public void deleteById(int id){
        rPelicula.deleteById(id);
    }

}
