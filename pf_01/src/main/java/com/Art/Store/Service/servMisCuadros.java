package com.Art.Store.Service;

import com.Art.Store.Entity.ListaCuadros;
import com.Art.Store.Repository.repoMisCuadros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servMisCuadros {

    @Autowired
    private repoMisCuadros miCuadro;

    public void guardaMisCuadros(ListaCuadros cuadro){
        miCuadro.save(cuadro);
    }

    public List<ListaCuadros> getMisCuadros(){
        return miCuadro.findAll();
    }

    public void deleteById(int id){
        miCuadro.deleteById(id);
    }
}
