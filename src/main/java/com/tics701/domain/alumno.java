/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tics701.domain;

/**
 *
 * @author sunny
 */
public class alumno {
    private String Nombre;
    private String NoControl;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public alumno(String Nombre, String NoControl) {
        this.Nombre = Nombre;
        this.NoControl = NoControl;
    }
    
   
}
