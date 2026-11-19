package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarNivelFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNivel("Sênior");

        assertEquals("Sênior", funcionario.getNivel());
    }

    @Test
    void deveRetornarScoreFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNivel("Sênior");

        assertEquals(90.0f, funcionario.getScore());
    }

    @Test
    void deveRetornarNivelTraineePorPadraoOuNaoReconhecido() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNivel("Desconhecido");

        assertEquals("Trainee", funcionario.getNivel());
        assertEquals(0.0f, funcionario.getScore());
    }
}