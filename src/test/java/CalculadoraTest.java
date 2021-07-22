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
}