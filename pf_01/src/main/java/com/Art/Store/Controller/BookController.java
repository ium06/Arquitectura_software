package com.Art.Store.Controller;

import com.Art.Store.Entity.Libro;
import com.Art.Store.Entity.ListaLibros;
import com.Art.Store.Service.servLibro;

import com.Art.Store.Service.servMisLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class BookController {

    @Autowired
    private servLibro sLibro;

    @Autowired
    private servMisLibros sMisLibros;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/registro_libro")
    public String registroLibro(){
        return "registroLibro";
    }

    @GetMapping("/disponible_libro")
    public ModelAndView getAllLibro(){
        List<Libro>list = sLibro.getAllLibro();
        return new ModelAndView("listaLibro", "libro", list);
    }

    @PostMapping("/save")
    public String agregaLibro(@ModelAttribute Libro libro){
        sLibro.save(libro);
        return "redirect:/disponible_libro";
    }

    @GetMapping("/mis_Libros")
    public String getMisLibros(Model model){
        List <ListaLibros> list=sMisLibros.getMisLibros();
        model.addAttribute("libro", list);
        return "misLibros";
    }

    @RequestMapping("/misLibros/{id}")
    public String getMiLista(@PathVariable("id") int id){
        Libro libro=sLibro.getLibroById(id);
        ListaLibros mb= new ListaLibros(libro.getId(), libro.getTitulo(), libro.getAutor(), libro.getPrecio());
        sMisLibros.guardaMisLibros(mb);
        return "redirect:/mis_Libros";
    }

    @RequestMapping("/editaLibro/{id}")
    public String editaLibro(@PathVariable("id") int id, Model model){
        Libro libro= sLibro.getLibroById(id);
        model.addAttribute("libro", libro);
        return "";
    }

    @RequestMapping("/eliminaLibro/{id}")
    public String eliminaLibro(@PathVariable("id") int id){
        sLibro.deleteById(id);
        return "redirect:/disponible_libro";
    }

}
