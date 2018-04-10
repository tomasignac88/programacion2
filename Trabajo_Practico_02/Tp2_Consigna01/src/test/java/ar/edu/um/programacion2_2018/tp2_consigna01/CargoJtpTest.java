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
public class CargoJtpTest {
    
    public CargoJtpTest() {
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
     * Test of toString method, of class CargoJtp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CargoJtp instance = new CargoJtp();
        String expResult = "Tomas Masiero-20000";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        if (!result.equals(expResult)) {
        fail("The test case is a prototype.");}
    }
    
}
