/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp2_consigna01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomas
 */
public class ProfesorAdjuntoTest {
    
    public ProfesorAdjuntoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of toString method, of class ProfesorAdjunto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProfesorAdjunto instance = new ProfesorAdjunto();
        String expResult = "1-Fernando-Villareal-null-1-Ecuaciones-3";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
        fail("The test case is a prototype.");}
    }
    
}
