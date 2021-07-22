package ec.edu.epn.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void given_two_integers_when_addition_then_ok(){
        Calculadora c = new Calculadora();
        int expected = 21;
        int actual = c.addition(6,15);
        assertEquals(expected,actual);
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        Calculadora c = new Calculadora();
        int expected = 9;
        int actual = c.subtraction(15,6);
        assertEquals(expected,actual);
    }
    @Test
    public void given_two_integers_when_multiplication_then_ok(){
        Calculadora c = new Calculadora();
        int expected = 42;
        int actual = c.multiplication(7,6);
        assertEquals(expected,actual);
    }

    @Test
    public void given_two_integers_when_division_then_ok(){
        Calculadora c = new Calculadora();
        int expected = 7;
        int actual = c.division(42,6);
        assertEquals(expected,actual);
    }
}