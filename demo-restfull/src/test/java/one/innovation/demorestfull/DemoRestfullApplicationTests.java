package one.innovation.demorestfull;

import one.innovation.demorestfull.controller.SoldadoController;
import one.innovation.demorestfull.dto.Soldado;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoRestfullApplicationTests {

	private static final String BASE_URL = "http://localhost:8080/v1/soldado";

	@Autowired
	private TestRestTemplate restTemplate;
	@Autowired
	private SoldadoController soldadoController;

	@Test
	void contextLoads() {
		assertThat(soldadoController).isNotNull();
	}

	private HttpEntity<Soldado> getHttpEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("authorization","JAVA");
		return new HttpEntity<>(headers);
	}

	@Test
	public void testeBuscarUmSoldadoPeloCpf() {
		ResponseEntity<Soldado> response = restTemplate
				.exchange(BASE_URL.concat("/1020304050"), HttpMethod.GET, getHttpEntity(), Soldado.class);

		Assertions.assertEquals("Legolas", response.getBody().getNome());
	}

	@Test
	public void testeBuscarTodosSoldados() {
		ResponseEntity<List> response = restTemplate
				.exchange(BASE_URL, HttpMethod.GET, getHttpEntity(), List.class);

		Assertions.assertEquals(3, response.getBody().size());
	}

	@Test
	public void testeCriarSoldado() {
		Map<String, Object> json = Map.of(
				"cpf", "10203040",
				"nome", "Katurus",
				"raca", "Elfo",
				"arma", "Espada");

		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(json, getHttpEntity().getHeaders());

		ResponseEntity<Void> response = restTemplate
				.exchange(BASE_URL, HttpMethod.POST, entity, Void.class);

		Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}

	@Test
	public void testeEditarSoldado() throws JSONException {
		Map<String, Object> json = Map.of(
				"cpf", "10203040",
				"nome", "Katurus",
				"raca", "Elfo",
				"arma", "Espada");

		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(json, getHttpEntity().getHeaders());

		ResponseEntity<Void> response = restTemplate
				.exchange(BASE_URL.concat("/10203040"), HttpMethod.PUT, entity, Void.class);

		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
	}

	@Test
	public void testeDeletarSoldado() {
		ResponseEntity<Void> response = restTemplate
				.exchange(BASE_URL.concat("/10203040"), HttpMethod.DELETE, getHttpEntity(), Void.class);

		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
