package me.dio.aula.spring.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot.
 * Módulo:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * - Swagger Doc: <a href="http://localhost:8080/swagger-ui.html></a>"
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
