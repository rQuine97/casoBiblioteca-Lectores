/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.serviceImpl;

import com.app.web.entity.Lector;
import com.app.web.repository.LectorRepository;
import com.app.web.service.LectorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectorServiceImpl implements LectorService{
    
    @Autowired
    private LectorRepository repository;
    
    @Override
    public List<Lector> readAll() {
        return repository.findAll();
    }

    @Override
    public Lector create(Lector lector) {
        return repository.save(lector);
    }

    @Override
    public Lector update(Lector lector) {
        return repository.save(lector);
    }

    @Override
    public Lector read(int idlector) {
        return repository.findById(idlector).get();
    }

    @Override
    public void delete(int idlector) {
        repository.deleteById(idlector);
    }
    
}
