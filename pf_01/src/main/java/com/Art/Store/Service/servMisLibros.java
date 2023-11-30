package com.Art.Store.Service;

import com.Art.Store.Entity.ListaLibros;
import com.Art.Store.Repository.repoMisLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servMisLibros {

    @Autowired
    private repoMisLibros miLibro;

    public void guardaMisLibros(ListaLibros libro){
        miLibro.save(libro);
    }

    public List<ListaLibros> getMisLibros(){
        return miLibro.findAll();
    }

    public void deleteById(int id){
        miLibro.deleteById(id);
    }

}
