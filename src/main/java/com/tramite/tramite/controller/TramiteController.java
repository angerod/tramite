/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramite.tramite.controller;

import com.tramite.tramite.service.TramiteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tramite.tramite.model.Tramite;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author anger
 */

@RestController
@RequestMapping("/tramite")
@CrossOrigin
public class TramiteController {
    
    @Autowired
    private TramiteService tramiteService;    
    
    @GetMapping("/getAll")
    public List<Tramite> list(){
        return tramiteService.getAllTramites();
    }

    @PostMapping("/add")
    public String add(@RequestBody Tramite tramite){
        tramiteService.saveTramite(tramite);
        return "Nuevo tramite registrado";
    }   
    
    @PostMapping("/update/{id}")
    public String update(@RequestBody Tramite tramite,@PathVariable int id){
        tramiteService.updateTramite(tramite,id);
        return "Tramite actualizado";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        if (tramiteService.deleteTramite(id))
        return "El tramite numero "+id+" fue eliminado";
        else
             return "El tramite numero "+id+" no existe";
    }
    
}
