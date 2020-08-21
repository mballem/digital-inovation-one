package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTDDTest {

    @Test
    public void deveSomarDoisValore() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("2+2");
        assertEquals(4, soma);
    }
}
