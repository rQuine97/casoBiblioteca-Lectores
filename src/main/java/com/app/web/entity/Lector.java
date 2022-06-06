
package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lector")
public class Lector {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlector;
    
    @Column(name = "nombres", nullable = false, length =45)
    private String nombres;
    
    @Column(name = "apellidos", nullable = false, length = 45)
    private String apellidos;
    
    @Column(name = "dni", nullable = false, length=9, unique = true)
    private String dni;
    
    @Column(name = "telefono", nullable = false, length=9, unique = true)
    private String telefono;
    
    @Column(name = "correo", nullable = false, length = 45, unique = true)
    private String correo;
    
      
}
