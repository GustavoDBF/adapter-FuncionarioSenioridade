package org.example;

public class NivelProfissional implements INivel {

    private String nivel;

    @Override
    public String getNivel() {
        return this.nivel;
    }

    @Override
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}