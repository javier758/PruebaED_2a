/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jc959
 */
public class CursoTest {
    
    public CursoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    void testNombreCurso() {
        Curso curso = new Curso("Matemáticas");
        assertEquals("Matemáticas", curso.getNombre());
    }
    /**
     * Test of getNombre method, of class Curso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Curso instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aniadirAlumno method, of class Curso.
     */
    @Test
    public void testAniadirAlumno() {
        System.out.println("aniadirAlumno");
        Persona p = null;
        Curso instance = null;
        instance.aniadirAlumno(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
