package one.innovation.digital.junit5;

import one.innovation.digital.Calculadora;
import one.innovation.digital.Loja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class TestComJUnit5 {

    @Test
    public void testSomaIgualACinco() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("2+3");
        assumeTrue(soma == 5);
    }

    @Test
    public void testSomaIgualASete() {
        Calculadora calc = new Calculadora();
        assertEquals(calc.somar("2+3+2"), 7);
    }

    @Test
    public void testListaTamanhoQuatro() {
        Loja loja = new Loja();
        assumeTrue(loja.lojas().size() == 4);
    }

    @Test
    public void testListaDeveConterRenner() {
        Loja loja = new Loja();
        assumeTrue(loja.lojas().get(0).contains("Renner") );
    }

    @Test
    public void testListaDeveConterRiachuelo() {
        Loja loja = new Loja();
        String riachuelo = loja.lojas().get(1);
        assertEquals("Riachuelo", riachuelo);
    }
}
