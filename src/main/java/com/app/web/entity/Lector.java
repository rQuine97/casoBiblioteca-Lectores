/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    
    public Lector(){
        
    }

    public Lector(int idlector, String nombres, String apellidos, String dni, String telefono, String correo) {
        this.idlector = idlector;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Lector(String nombres, String apellidos, String dni, String telefono, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdlector() {
        return idlector;
    }

    public void setIdlector(int idlector) {
        this.idlector = idlector;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Lector{" + "idlector=" + idlector + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
