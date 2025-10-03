/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tics701.domain;

/**
 *
 * @author sunny
 *
 **/

import java.util.ArrayList;
import java.util.List;

public class portafolio {
    private String noControl; // Identificador basado en el noControl del Alumno
    private alumno alumno;   // Referencia al objeto Alumno
    private List<logro> logros; // Lista de logros

    // Constructor sin argumentos
    public portafolio() {
        this.logros = new ArrayList<>(); // Inicializa la lista
    }

    // Constructor con parámetros
    public portafolio(String noControl, alumno alumno) {
        this.noControl = noControl;
        this.alumno = alumno;
        this.logros = new ArrayList<>(); // Inicializa la lista
    }

    // Métodos getter y setter
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(alumno alumno) {
        this.alumno = alumno;
        this.noControl = alumno.getNoControl(); // Sincroniza el noControl
    }

    public List<logro> getLogros() {
        return logros;
    }

    public void setLogros(List<logro> logros) {
        this.logros = logros;
    }

    // Método para agregar un logro
    public void agregarLogro(logro logro) {
        if (logro != null) {
            this.logros.add(logro);
        }
    }

    @Override
    public String toString() {
        return "Portafolio{noControl=" + noControl + ", alumno=" + alumno + ", logros=" + logros + "}";
    }
}