package com.tics701.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class alumnoTest {
    
    private alumno instance; // Declara la variable de instancia como campo de clase

    public alumnoTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
        instance = new alumno("Juan Perez", "TI22110117"); // Inicializa la instancia antes de cada prueba
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetNoControl() {
        System.out.println("getNoControl");
        String expResult = "TI22110117"; // Ajusta según el valor inicial esperado
        String result = instance.getNoControl();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNoControl() {
        System.out.println("setNoControl");
        String noControl = "TI22110117";
        instance.setNoControl(noControl);
        assertEquals(noControl, instance.getNoControl());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Juan Perez"; // Ajusta según el valor inicial esperado
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Juan Pérez";
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }
}