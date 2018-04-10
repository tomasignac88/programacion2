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
public class CargoAdjuntoTest {
    
    public CargoAdjuntoTest() {
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
     * Test of toString method, of class CargoAdjunto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CargoAdjunto instance = new CargoAdjunto();
        String expResult = "Fernando Villareal-9000";
        String result = instance.toString();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
        fail("The test case is a prototype.");}
    }
    
}
