package com.gazaltech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@EnableWebFlux
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Exemplo de API do Spring WebFlux com OpenAPI")
                        .version("1.0.0")
                        .description("API de exemplo do Spring WebFlux com OpenAPI")
                );
    }
}
