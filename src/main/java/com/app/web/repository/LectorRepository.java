/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.repository;

import com.app.web.entity.Lector;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rquin
 */
public interface LectorRepository extends JpaRepository<Lector, Integer>{
    
}
