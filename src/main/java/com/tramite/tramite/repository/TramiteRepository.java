/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramite.tramite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tramite.tramite.model.Tramite;

/**
 *
 * @author anger
 */
public interface TramiteRepository extends JpaRepository<Tramite,Integer>{
    
}
