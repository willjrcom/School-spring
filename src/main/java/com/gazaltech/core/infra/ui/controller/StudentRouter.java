package com.gazaltech.core.infra.ui.controller;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import jakarta.validation.Valid;

@Configuration
public class StudentRouter {
	  @Bean
	  public RouterFunction<ServerResponse> route(@Valid StudentHandler handler) {
	    return RouterFunctions
	        .route(GET("/cpf/{cpf}").and(accept(MediaType.APPLICATION_JSON)), handler::findByCpf)
	        .andRoute(GET("/ra/{ra}").and(accept(MediaType.APPLICATION_JSON)), handler::findByRa)
        	.andRoute(GET("/email/{email}").and(accept(MediaType.APPLICATION_JSON)), handler::findByEmail)
        	.andRoute(GET("/all").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
        	.andRoute(GET("/save").and(accept(MediaType.APPLICATION_JSON)), handler::saveStudent);
	  }
}
