package com.Art.Store.Controller;


import com.Art.Store.Entity.Cuadro;
import com.Art.Store.Entity.ListaCuadros;
import com.Art.Store.Service.servCuadro;
import com.Art.Store.Service.servMisCuadros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CuadroController {

    @Autowired
    private servCuadro sCuadro;

    @Autowired
    private servMisCuadros sMisCuadros;

    @GetMapping("/registro_cuadro")
    public String registroCuadro(){
        return "registroCuadro";
    }

    @GetMapping("/disponible_cuadro")
    public ModelAndView getAllCuadro(){
        List<Cuadro> list = sCuadro.getAllCuadro();
        return new ModelAndView("listaCuadro", "cuadro", list);
    }

    @PostMapping("/guardaCuadro")
    public String agregaCuadro(@ModelAttribute Cuadro cuadro){
        sCuadro.save(cuadro);
        return "redirect:/disponible_cuadro";
    }

    @GetMapping("/mis_cuadros")
    public String getMisCuadros(Model model){
        List <ListaCuadros> list=sMisCuadros.getMisCuadros();
        model.addAttribute("cuadro", list);
        return "misCuadros";
    }

    @RequestMapping("/misCuadros/{id}")
    public String getMiLista(@PathVariable("id") int id){
        Cuadro cuadro=sCuadro.getCuadroById(id);
        ListaCuadros mb= new ListaCuadros(cuadro.getId(), cuadro.getTitulo(), cuadro.getAutor(), cuadro.getPrecio());
        sMisCuadros.guardaMisCuadros(mb);
        return "redirect:/mis_Cuadros";
    }

    @RequestMapping("/editaCuadro/{id}")
    public String editaLibro(@PathVariable("id") int id, Model model){
        Cuadro cuadro= sCuadro.getCuadroById(id);
        model.addAttribute("cuadro", cuadro);
        return "";
    }

    @RequestMapping("/eliminaCuadro/{id}")
    public String eliminaLibro(@PathVariable("id") int id){
        sCuadro.deleteById(id);
        return "redirect:/disponible_cuadros";
    }
}
