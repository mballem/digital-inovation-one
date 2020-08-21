package one.innovation.digital;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class RuleTest {

    @Rule // cria a pasta temporaria antes da execução do teste
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void deveCriarNovoArquivoNoDiretorioTemporario() throws IOException {
        File created = temporaryFolder.newFile("file-test.txt");
        assertTrue(created.isFile());
        assertEquals(temporaryFolder.getRoot(), created.getParentFile());
    }
}
