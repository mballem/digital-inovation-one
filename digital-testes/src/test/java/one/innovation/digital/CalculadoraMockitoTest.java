package one.innovation.digital;

import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraMockitoTest {

    @Test
    public void testSomar() {
        Calculadora calc = mock(Calculadora.class);
        when(calc.somar("1+2")).thenReturn(3);
    }

    @Test
    public void testTamanhoLista() {
        Loja loja = mock(Loja.class);
        when(loja.lojas()).thenReturn(Arrays.asList("Renner", "Riachuelo", "Luiza Magazine", "Grazziotin"));
    }
}
