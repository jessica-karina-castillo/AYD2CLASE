/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usac.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esvux
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    /**
     * Test of setA method, of class Calculadora.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        Integer a = 5;
        Calculadora instance = new Calculadora();
        instance.setA(a);
        // a = instance.a
        assertEquals(a, instance.getA());
    }

    /**
     * Test of setB method, of class Calculadora.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        Integer b = 8;
        Calculadora instance = new Calculadora();
        instance.setB(b);
        // b = instance.b
        assertEquals(b, instance.getB());
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Calculadora instance = new Calculadora(5, 8);
        Integer expResult = 13;
        Integer result = instance.sumar();
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Calculadora instance = new Calculadora(5, 8);
        Integer expResult = -3;
        Integer result = instance.restar();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora instance = new Calculadora(5, 8);
        Integer expResult = 40;
        Integer result = instance.multiplicar();
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora instance = new Calculadora(5, 8);
        Double expResult = 0.625;
        Double result = instance.dividir();
        assertEquals(expResult, result, 0.000001);
    }
 
}