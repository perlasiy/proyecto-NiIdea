package com.tics701.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class portafolioTest {
    
    private portafolio portafolio;
    private alumno alumno;
    private logro logro;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
        // Inicializa un Alumno
        alumno = new alumno("12345", "Juan Pérez");
        // Inicializa un Logro
        logro = new logro(1, "Matemáticas", "Aprobado con 10");
        // Inicializa el Portafolio con el Alumno
        portafolio = new portafolio("12345", alumno);
        // Agrega el Logro al Portafolio
        portafolio.agregarLogro(logro);
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetNoControl() {
        System.out.println("getNoControl");
        String expResult = "12345";
        String result = portafolio.getNoControl();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expected = "Portafolio{noControl=12345, alumno=" + alumno + ", logros=[" + logro + "]}";
        String result = portafolio.toString();
        assertEquals(expected, result); // Ajusta según el formato real de toString
    }

    @Test
    public void testSetNoControl() {
        System.out.println("setNoControl");
        String noControl = "67890";
        portafolio.setNoControl(noControl);
        assertEquals(noControl, portafolio.getNoControl());
    }

    @Test
    public void testAgregarLogro() {
        System.out.println("agregarLogro");
        logro newLogro = new logro(2, "Programación", "Proyecto completado");
        portafolio.agregarLogro(newLogro);
        List<logro> logros = portafolio.getLogros();
        assertEquals(2, logros.size());
        assertTrue(logros.contains(newLogro));
    }

    @Test
    public void testSetAlumno() {
        System.out.println("setAlumno");
        alumno newAlumno = new alumno("67890", "María López");
        portafolio.setAlumno(newAlumno);
        assertEquals(newAlumno, portafolio.getAlumno());
        assertEquals(newAlumno.getNoControl(), portafolio.getNoControl());
    }

    @Test
    public void testSetLogros() {
        System.out.println("setLogros");
        List<logro> newLogros = new ArrayList<>();
        newLogros.add(new logro(3, "Física", "Aprobado"));
        portafolio.setLogros(newLogros);
        assertEquals(newLogros, portafolio.getLogros());
    }

    @Test
    public void testGetLogros() {
        System.out.println("getLogros");
        List<logro> expResult = new ArrayList<>();
        expResult.add(logro); // Asegúrate de que coincida con lo inicializado en setUp
        List<logro> result = portafolio.getLogros();
        assertEquals(expResult.size(), result.size());
        assertTrue(result.contains(logro));
    }
}