package org.usac.calculadora;

/**
 *
 * @author esvux
 */
public class Calculadora
{

    private Integer a, b;

    public Calculadora() {
        this.a = null;
        this.b = null;
    }
    
    public Calculadora(Integer a, Integer b) 
    {
        this.a = a;
        this.b = b;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
    
    public Integer sumar()
    {
        return a + b;
    }
    
    public Integer restar()
    {
        return a - b;
    }

    public Integer multiplicar()
    {
        return a * b;
    }
    
    public Double dividir()
    {
        if(b==0)
        {
            throw new ArithmeticException("Error, división entre cero.");
        }
        return (a + 0.0) / b;
    }
    
    public Double logBaseX()
    {
        if(a <= 0){
            throw new ArithmeticException("Error, el argumento del logaritmo no puede ser menor que cero.");
        }
        if(b <= 0){
            throw new ArithmeticException("Error, la base del logaritmo no puede ser menor que cero.");
        }
        return Math.log10(a) / Math.log10(b);
    }
    
}
