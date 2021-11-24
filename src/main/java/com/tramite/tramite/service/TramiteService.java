/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramite.tramite.service;

import java.util.List;
import java.util.Optional;
import com.tramite.tramite.model.Tramite;

/**
 *
 * @author anger
 */
public interface TramiteService {
    
        
    public List<Tramite> getAllTramites();
    public Tramite saveTramite(Tramite tramite);
    public Tramite updateTramite(Tramite tramite, int id);
    public Boolean deleteTramite(int id);
    
}
