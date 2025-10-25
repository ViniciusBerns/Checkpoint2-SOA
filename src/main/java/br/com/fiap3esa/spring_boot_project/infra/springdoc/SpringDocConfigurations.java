package br.com.fiap3esa.spring_boot_project.infra.springdoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("API Sistema de Gerenciamento - FIAP 3ESA")
                        .description("API REST para gerenciamento de Instrutores, Alunos e Usuários com autenticação JWT")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Time de Desenvolvimento")
                                .email("contato@fiap.com.br")));
    }
}

