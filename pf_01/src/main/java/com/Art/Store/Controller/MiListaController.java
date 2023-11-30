package com.Art.Store.Controller;


import com.Art.Store.Service.servMisLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiListaController {

    @Autowired
    private servMisLibros sMisLibros;

    @RequestMapping("/deleteMiLista/{id}")
    public String deleteMiLista(@PathVariable("id") int id){
        sMisLibros.deleteById(id);
        return "redirect:/mis_Libros";
    }
}
