/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java_lpoo2.lista1_exc2;
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
public class lista1_exc2Test {
    
    public lista1_exc2Test() {
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
     * Test of calculaSalarioBruto method, of class lista1_exc2.
     */
    @Test
    public void testCalculaSalarioBruto() {
        System.out.println("calculaSalarioBruto");
        double salHora = 0.0;
        double horasTrabalhadas = 0.0;
        double expResult = 0.0;
        double result = lista1_exc2.calculaSalarioBruto(salHora, horasTrabalhadas);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalarioLiquido method, of class lista1_exc2.
     */
    @Test
    public void testCalculaSalarioLiquido() {
        System.out.println("calculaSalarioLiquido");
        double salarioBruto = 0.0;
        double descontoINSS = 0.0;
        double expResult = 0.0;
        double result = lista1_exc2.calculaSalarioLiquido(salarioBruto, descontoINSS);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeDadosEmpregado method, of class lista1_exc2.
     */
    @Test
    public void testImprimeDadosEmpregado() throws Exception {
        System.out.println("imprimeDadosEmpregado");
        double salHora = 0.0;
        double horasTrabalhadas = 0.0;
        double descontoINSS = 0.0;
        String expResult = "";
        String result = lista1_exc2.imprimeDadosEmpregado(salHora, horasTrabalhadas, descontoINSS);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class lista1_exc2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lista1_exc2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
