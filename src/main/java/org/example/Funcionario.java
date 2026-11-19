package org.example;

public class Funcionario {

    INivel nivel;
    NivelAdapter persistencia;

    public Funcionario() {
        nivel = new NivelProfissional();
        persistencia = new NivelAdapter(nivel);
    }

    public void setNivel(String descricaoNivel) {
        nivel.setNivel(descricaoNivel);
        persistencia.salvarNivel();
    }

    public String getNivel() {
        return persistencia.recuperarNivel();
    }

    public float getScore() {
        return persistencia.getScore();
    }
}