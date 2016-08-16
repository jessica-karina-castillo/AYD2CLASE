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
    
    /**
     * Test of dividir method, verifies when the divisor is equal zero to launch an aritmethic exception.
    */
    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero(){
        System.out.println("dividir entre cero");
        Calculadora instance = new Calculadora(10, 0);
        instance.dividir();
    }
    
    /**
     * Test of logBaseN, of class Calculadora.
     */
    @Test
    public void testLogBaseN(){
        System.out.println("logaritmo base 2 de 8");
        Calculadora instance = new Calculadora(8, 2);
        Double result = instance.logBaseX();
        assertEquals(3.0, result, 0.000001);
    }
    
    /**
     * Test of logBaseN, verifies when the new base is less than equals zero to launch an arithmetic exception.
     */
    @Test(expected = ArithmeticException.class)
    public void testLogBaseN_badBase(){
        System.out.println("logaritmo base -1 de 10");
        Calculadora instance = new Calculadora(10, -1);
        instance.logBaseX();
    }    
 
    /**
     * Test of logBaseN, verifies when the argument is less than equals zero to launch an arithmetic exception.
     */
    @Test(expected = ArithmeticException.class)
    public void testLogBaseN_badArgument(){
        System.out.println("logaritmo base 10 de 0");
        Calculadora instance = new Calculadora(0, 10);
        instance.logBaseX();
    }

}