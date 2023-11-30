package com.Art.Store.Controller;

import com.Art.Store.Entity.ListaPeliculas;
import com.Art.Store.Entity.Pelicula;
import com.Art.Store.Service.servMisPeliculas;
import com.Art.Store.Service.servPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PeliculaController {


    @Autowired
    private servPelicula sPelicula;

    @Autowired
    private servMisPeliculas sMisPeliculas;

    @GetMapping("/registro_pelicula")
    public String registroPelicula(){
        return "registroPelicula";
    }

    @GetMapping("/disponible_pelicula")
    public ModelAndView getAllPelicula(){
        List<Pelicula> list = sPelicula.getAllPelicula();
        return new ModelAndView("listaPelicula", "pelicula", list);
    }

    @PostMapping("/guardaPelicula")
    public String agregaPelicula(@ModelAttribute Pelicula pelicula){
        sPelicula.save(pelicula);
        return "redirect:/disponible_pelicula";
    }

    @GetMapping("/mis_pelicula")
    public String getMisPelicula(Model model){
        List <ListaPeliculas> list=sMisPeliculas.getMisPelicula();
        model.addAttribute("pelicula", list);
        return "misPeliculas";
    }

    @RequestMapping("/misPeliculas/{id}")
    public String getMiLista(@PathVariable("id") int id){
        Pelicula pelicula=sPelicula.getPeliculaById(id);
        ListaPeliculas mb= new ListaPeliculas(pelicula.getId(), pelicula.getTitulo(), pelicula.getAutor(), pelicula.getPrecio());
        sMisPeliculas.guardaMisPeliculas(mb);
        return "redirect:/mis_Peliculas";
    }

    @RequestMapping("/editaPelicula/{id}")
    public String editaPeliculas(@PathVariable("id") int id, Model model){
        Pelicula pelicula= sPelicula.getPeliculaById(id);
        model.addAttribute("pelicula", pelicula);
        return "";
    }

    @RequestMapping("/eliminaPelicula/{id}")
    public String eliminaPelicula (@PathVariable("id") int id){
        sPelicula.deleteById(id);
        return "redirect:/disponible_cuadros";
    }

}
