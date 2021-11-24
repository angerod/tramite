/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramite.tramite.service;

import com.tramite.tramite.model.Tramite;
import com.tramite.tramite.repository.TramiteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anger
 */
@Service
public class TramiteServiceImpl implements TramiteService {   
          
    @Autowired
    private TramiteRepository tramiteRepository;
    
    @Override
    public List<Tramite> getAllTramites() {
        return tramiteRepository.findAll();
    }    
        
    @Override
    public Tramite saveTramite(Tramite tramite) {
        return tramiteRepository.save(tramite);
    }
    
    @Override
    public Tramite updateTramite(Tramite tramite, int id) {
        Optional<Tramite> s = tramiteRepository.findById(id);
        if(s.isPresent()){
        tramite.setId(id);
        return tramiteRepository.save(tramite);
        }else
            return null;        
    }
   
    @Override
    public Boolean deleteTramite(int id) {
        Optional<Tramite> s = tramiteRepository.findById(id);
        if(s.isPresent()){
        tramiteRepository.deleteById(id);
        return true;
        }else
            return false;        
    }
    
}
