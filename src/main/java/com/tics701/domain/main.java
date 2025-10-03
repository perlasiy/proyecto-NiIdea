/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tics701.domain;

/**
 *
 * @author sunny
 */

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Crear instancias de Alumno
        alumno alumno1 = new alumno("12345", "Juan Pérez");
        alumno alumno2 = new alumno("67890", "María López");

        // Crear instancias de Logro
        logro logro1 = new logro(1, "Matemáticas", "Aprobado con 10");
        logro logro2 = new logro(2, "Programación", "Proyecto completado");
        logro logro3 = new logro(3, "Física", "Aprobado");

        // Crear instancias de Portafolio
        portafolio portafolio1 = new portafolio("12345", alumno1);
        portafolio1.agregarLogro(logro1);
        portafolio1.agregarLogro(logro2);

        portafolio portafolio2 = new portafolio("67890", alumno2);
        portafolio2.agregarLogro(logro3);

        // Simular un repositorio de portafolios
        List<portafolio> repositorio = new ArrayList<>();
        repositorio.add(portafolio1);
        repositorio.add(portafolio2);

        // Método de búsqueda
        String noControlBuscado = "12345";
        portafolio resultado = buscarPortafolio(repositorio, noControlBuscado);

        // Mostrar resultado
        if (resultado != null) {
            System.out.println("Portafolio encontrado: " + resultado);
        } else {
            System.out.println("No se encontró un portafolio con noControl: " + noControlBuscado);
        }

        // Probar con un noControl que no existe
        noControlBuscado = "99999";
        resultado = buscarPortafolio(repositorio, noControlBuscado);
        if (resultado != null) {
            System.out.println("Portafolio encontrado: " + resultado);
        } else {
            System.out.println("No se encontró un portafolio con noControl: " + noControlBuscado);
        }
    }

    // Método para buscar un Portafolio por noControl
    public static portafolio buscarPortafolio(List<portafolio> repositorio, String noControl) {
        for (portafolio p : repositorio) {
            if (p.getNoControl().equals(noControl)) {
                return p;
            }
        }
        return null;
    }
}