package one.innovation.demorestfull;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.innovation.demorestfull.dto.Soldado;
import org.hamcrest.collection.IsCollectionWithSize;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class SoldadaControllerTests {

    @Autowired
    protected MockMvc mock;

    private static String entityToJson(final Object entity) {
        try {
            return new ObjectMapper().writeValueAsString(entity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void deveRetornarSoldadoDeNomeLegolas() throws Exception {
        mock.perform( MockMvcRequestBuilders
                .get("/v1/soldado/10506080")
                .header("authorization", "JAVA")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andExpect(MockMvcResultMatchers.status().isOk())
         .andExpect(MockMvcResultMatchers
                 .jsonPath("$.nome", Is.is("Legolas")));
    }

    @Test
    public void deveRetornarEsperadoJson() throws Exception {
        mock.perform( MockMvcRequestBuilders
                .get("/v1/soldado/10506080")
                .header("authorization", "JAVA")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andExpect(MockMvcResultMatchers.status().isOk())
         .andExpect(MockMvcResultMatchers
                 .content()
                 //.json("{'cpf':'10506080', 'nome':'Legolas', 'raca':'Elfo', 'arma':'Arco e Flecha'}"));
                .json(entityToJson(new Soldado("10506080", "Legolas", "Elfo", "Arco e Flecha"))));
    }

    @Test
    public void deveRetornarTresSoldados() throws Exception {
        mock.perform( MockMvcRequestBuilders
                .get("/v1/soldado")
                .header("authorization", "JAVA")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
        ).andExpect(MockMvcResultMatchers.status().isOk())
         .andExpect(MockMvcResultMatchers
                .jsonPath("$.*", IsCollectionWithSize.hasSize(3)));
    }

    @Test
    public void deveRetornarStatus201() throws Exception {
        mock.perform( MockMvcRequestBuilders
                .post("/v1/soldado")
                .header("authorization", "JAVA")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(entityToJson(new Soldado("10508090", "Kitheris", "Elfo", "Adagas")))
        ).andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    public void deveExcluirComStatus200() throws Exception {
        mock.perform(MockMvcRequestBuilders
                .delete("/v1/soldado/10509080")
                        .header("authorization", "JAVA")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
