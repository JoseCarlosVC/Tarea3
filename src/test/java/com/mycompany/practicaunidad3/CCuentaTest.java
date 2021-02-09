/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaunidad3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class CCuentaTest {
    
    public CCuentaTest() {
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
     * Test of asignarNombre method, of class CCuenta.
     */
   /* @Test
    public void testAsignarNombre() {
        System.out.println("asignarNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.asignarNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombre method, of class CCuenta.
     */
  /*  @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estado method, of class CCuenta.
     */
   /* @Test
    public void testEstado() {
        System.out.println("estado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.estado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("Prueba del método ingresar");
        double cantidad = 100.0;
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        instance.ingresar(cantidad);  
        
        assertEquals("Debe dar 2750",2600.0,instance.estado(),0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("Prueba del método retirar");
        double cantidad = 2500.0;
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        instance.retirar(cantidad);
        assertEquals("Debe dar 1500",0.0,instance.estado(),0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCuenta method, of class CCuenta.
     */
/*    @Test
    public void testObtenerCuenta() {
        System.out.println("obtenerCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */   
    @Test
    public void testRetirarIngresar() throws Exception {
        System.out.println("Prueba de ingreso/retirada");
        double cantidad = 2500;
        double cantidad2 = 2500;
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        System.out.println("Antes de retirar dinero tenemos %.2f\n " + instance.estado());
        instance.retirar(cantidad);
        assertEquals("Debe dar 2499",0.0,instance.estado(),0);
        System.out.println("Retiramos %.2f y nos queda %.2f\n " + cantidad + " " + instance.estado());
        instance.ingresar(cantidad2);
        assertEquals("Debe dar 2500",2500.0,instance.estado(),0);
        System.out.println("Depués de ingresar %.2f tenemos %.2f\n " + cantidad2 + " " + instance.estado());
        
    }
    
}
