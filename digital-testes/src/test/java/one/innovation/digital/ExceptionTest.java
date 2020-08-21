package one.innovation.digital;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    // teste passa quando a exceção for lançada
    @Test(expected = IndexOutOfBoundsException.class)
    public void testLancaExcecaoAoRecurperarPosicaoDaListaInexistente() {
        String nome = new Loja().lojas().get(4);
    }

    @Test(expected = NullPointerException.class)
    public void testLancaExceaoQuandoObjetoEstiverNulo() {
        Loja loja = null;
        List<String> nomes = loja.lojas();
    }

    @Test
    public void testExceptionMessage() {
        try {
            String nome = new Loja().lojas().get(4);
            fail("Esperando por uma IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("4"));
        }
    }
}
