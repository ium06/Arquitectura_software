package com.Art.Store.Service;

import com.Art.Store.Entity.Cuadro;
import com.Art.Store.Repository.repCuadro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servCuadro {
    @Autowired
    private repCuadro rCuadro;
    public void save(Cuadro cuadro){
        rCuadro.save(cuadro);
    }

    public List<Cuadro> getAllCuadro(){
        return rCuadro.findAll();
    }

    public Cuadro getCuadroById(int id){
        return rCuadro.findById(id).get();
    }

    public void deleteById(int id){
        rCuadro.deleteById(id);
    }
}
