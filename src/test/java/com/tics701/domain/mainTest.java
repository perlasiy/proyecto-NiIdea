/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tics701.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class mainTest {
    
    private List<portafolio> repositorio;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
        // Inicializar el repositorio con datos de prueba
        repositorio = new ArrayList<>();
        alumno alumno1 = new alumno("12345", "Juan Pérez");
        alumno alumno2 = new alumno("67890", "María López");
        logro logro1 = new logro(1, "Matemáticas", "Aprobado con 10");
        portafolio portafolio1 = new portafolio("12345", alumno1);
        portafolio1.agregarLogro(logro1);
        repositorio.add(portafolio1);
        repositorio.add(new portafolio("67890", alumno2));
    }

    @AfterEach
    public void tearDown() throws Exception {
        repositorio = null; // Opcional: limpiar después de cada prueba
    }

    @Test
    public void testBuscarPortafolioExistente() {
        System.out.println("buscarPortafolioExistente");
        // Ejecutar la búsqueda
        portafolio result = main.buscarPortafolio(repositorio, "12345");
        // Verificar el resultado
        assertNotNull(result);
        assertEquals("12345", result.getNoControl());
    }

    @Test
    public void testBuscarPortafolioNoExistente() {
        System.out.println("buscarPortafolioNoExistente");
        // Ejecutar la búsqueda
        portafolio result = main.buscarPortafolio(repositorio, "99999");
        // Verificar el resultado
        assertNull(result);
    }

    @Test
    public void testBuscarPortafolioConRepositorioVacio() {
        System.out.println("buscarPortafolioConRepositorioVacio");
        // Reinicializar repositorio como vacío para esta prueba
        repositorio.clear();
        // Ejecutar la búsqueda
        portafolio result = main.buscarPortafolio(repositorio, "12345");
        // Verificar el resultado
        assertNull(result);
    }

    @Test
    public void testMain() {
        System.out.println("testMain");
        // Este test puede simular la ejecución del main si es necesario
        // Por simplicidad, lo dejamos como un test básico
        assertTrue(true); // Placeholder, ajusta según lo que quieras probar del main
    }
}