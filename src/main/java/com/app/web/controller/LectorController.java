/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.controller;

import com.app.web.entity.Lector;
import com.app.web.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LectorController {
    
    @Autowired
    private LectorService service;
    
    @GetMapping({"/lectores","/"})
    public String getLectores(Model modelo) {
        modelo.addAttribute("lectores", service.readAll());
        return "lectores";
    }
    
    @GetMapping("/lectores/nuevo")
    public String showFormLector(Model modelo){
        Lector lector = new Lector();
        modelo.addAttribute("lector", lector);
        return "crear_lector";
    }
    
    @PostMapping("/lectores")
    public String addLector(@ModelAttribute("lector") Lector lector){
        service.create(lector);
        return "redirect:/lectores";
    }
    
    @GetMapping("/lectores/editar/{idlector}")
    public String showFormLector(@PathVariable Integer idlector, Model modelo) {
        modelo.addAttribute("lector", service.read(idlector));
        return "editar_lector";
    }
    
    @PostMapping("/lectores/{idlector}")
    public String editLector(@PathVariable Integer idlector, @ModelAttribute("lector") Lector lector, Model modelo) {
        Lector lectorExistente = service.read(idlector);
        lectorExistente.setIdlector(idlector);
        lectorExistente.setNombres(lector.getNombres());
        lectorExistente.setApellidos(lector.getApellidos());
        lectorExistente.setDni(lector.getDni());
        lectorExistente.setTelefono(lector.getTelefono());
        lectorExistente.setCorreo(lector.getCorreo());
        
        service.update(lectorExistente);
        return "redirect:/lectores";
        
    }
    
    @GetMapping("/lectores/{idlector}")
    public String deleteLector(@PathVariable Integer idlector) {
        service.delete(idlector);
        return "redirect:/lectores";
    }
}
