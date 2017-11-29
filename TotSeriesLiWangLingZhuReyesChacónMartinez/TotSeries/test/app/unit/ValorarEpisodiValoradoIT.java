package app.unit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.ValorarEpisodi;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author li
 */
public class ValorarEpisodiValoradoIT {
    
    public ValorarEpisodiValoradoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ValidarUsuari method, of class ValorarEpisodi.
     */
    @Test
    public void testValidarUsuari() {
        System.out.println("ValidarUsuari");
        String usuari = "";
        ValorarEpisodi instance = new ValorarEpisodi();
        boolean expResult = false;
        boolean result = instance.ValidarUsuari(usuari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ComprovarVisualitzacions method, of class ValorarEpisodi.
     */
    @Test
    public void testComprovarVisualitzacions() {
        System.out.println("ComprovarVisualitzacions");
        String usuari = "";
        ValorarEpisodi instance = new ValorarEpisodi();
        boolean expResult = false;
        boolean result = instance.ComprovarVisualitzacions(usuari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ComprovarValoracions method, of class ValorarEpisodi.
     */
    @Test
    public void testComprovarValoracions() {
        System.out.println("ComprovarValoracions");
        String usuari = "";
        ValorarEpisodi instance = new ValorarEpisodi();
        boolean expResult = false;
        boolean result = instance.ComprovarValoracions(usuari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
