package com.app.web;

import com.app.web.entity.Lector;
import com.app.web.repository.LectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LectorBibliotecaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LectorBibliotecaApplication.class, args);
    }
    
    @Autowired
    private LectorRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
//        Lector lector1 = new Lector("Ricardo", "Quine", "75693135", "987654321", "ricardo@quine.com");
//        repository.save(lector1);
//        
//        Lector lector2 = new Lector("Andree", "Maguina", "73112941", "987654322", "andree@maguina.com");
//        repository.save(lector2);
    }

}
