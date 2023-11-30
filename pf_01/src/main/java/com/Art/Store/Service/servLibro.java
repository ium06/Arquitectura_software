package com.Art.Store.Service;

import com.Art.Store.Entity.Libro;
import com.Art.Store.Repository.repLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servLibro {

    @Autowired
    private repLibro rLibro;
    public void save(Libro libro){
        rLibro.save(libro);
    }

    public List <Libro> getAllLibro(){
        return rLibro.findAll();
    }

    public Libro getLibroById(int id){
        return rLibro.findById(id).get();
    }

    public void deleteById(int id){
        rLibro.deleteById(id);
    }
}
