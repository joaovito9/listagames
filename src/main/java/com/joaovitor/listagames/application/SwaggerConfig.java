package com.joaovitor.listagames.application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Listagem de Jogos")
                        .description("API para gerenciamento de jogos")
                        .contact(new Contact().name("João Vítor").email("joaovm2000@hotmail.com"))
                        .version("1.0.0"));
    }
}
