package basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTeste {
    private Calculadora c;

    @BeforeEach
    public void init(){
        c = new Calculadora();
    }

    @Test
    public void testSoma(){
        double resp = c.calc(2, 10, '+');
        assertEquals(12.0, resp);
    }

    @Test
    public void testMult(){
        double resp = c.calc(2, 10, '*');
        assertEquals(20, resp);
    }

    @Test
    public void testMin(){
        double resp = c.calc(2, 10, '-');
        assertEquals(-8, resp);
    }

    @Test
    public void testDiv(){
        double resp = c.calc(2, 10, '/');
        assertEquals(0.2, resp);
    }

}
