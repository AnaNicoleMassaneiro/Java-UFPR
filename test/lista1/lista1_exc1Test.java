/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java_lpoo2.lista1_exc1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ana
 */
public class lista1_exc1Test {
    
    public lista1_exc1Test() {
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
    public void texarDown() {
    }

    /**
     * Test of calculaAreaRetangulo method, of class lista1_exc1.
     */
    @Test
    public void testCalculaAreaRetangulo() {
        System.out.println("calculaAreaRetangulo");
        double lado1 = 0.0;
        double lado2 = 0.0;
        double expResult = 0.0;
        double result = lista1_exc1.calculaAreaRetangulo(lado1, lado2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaAreaCircunferencia method, of class lista1_exc1.
     */
    @Test
    public void testCalculaAreaCircunferencia() {
        System.out.println("calculaAreaCircunferencia");
        double raio = 0.0;
        double expResult = 0.0;
        double result = lista1_exc1.calculaAreaCircunferencia(raio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaAreaTriangulo method, of class lista1_exc1.
     */
    @Test
    public void testCalculaAreaTriangulo() {
        System.out.println("calculaAreaTriangulo");
        double base = 0.0;
        double altura = 0.0;
        double expResult = 0.0;
        double result = lista1_exc1.calculaAreaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class lista1_exc1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lista1_exc1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
