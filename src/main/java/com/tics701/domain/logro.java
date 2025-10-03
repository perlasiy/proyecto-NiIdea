/*
 * ITESS-TICS Investigación l
 * Agostro-Diciembre 2025
 * Proyecto Ni Idea
 * Clase logro: Representa una hablididad ya adquirida del alumno mediante una evidencia
 * Docente: FJMP
 * Programador: Perla
 * Fecha: 02/10/2025
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tics701.domain;

/**
 *
 * @author sunny
 */
public class logro {
    private int id; 
    private String categoria;
    private String descripcion;

    public logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
