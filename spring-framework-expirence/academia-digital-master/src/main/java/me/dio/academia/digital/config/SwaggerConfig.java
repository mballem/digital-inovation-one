package me.dio.academia.digital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("me.dio.academia.digital.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo())
                .pathMapping("/");
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("API Avaliação Física")
                .description("REST API de Avaliação Física")
                .version("1.0.0")
                .contact(new Contact(
                        "Marcio Dio Me",
                        "https://dio.me/",
                        "fakecontato@dio.me"))
                .build();
    }
}
