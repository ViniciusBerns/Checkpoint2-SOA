package br.com.fiap3esa.spring_boot_project.domain.instrutor;

import br.com.fiap3esa.spring_boot_project.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroInstrutor(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{9,11}")
        String cnh,

        @NotNull
        Especialidade especialidade,

        @Valid
        DadosEndereco endereco) {
}