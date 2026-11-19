package org.example;

public class NivelAdapter extends ScoreAvaliacao {

    private INivel nivelProfissional;

    public NivelAdapter(INivel nivelProfissional) {
        this.nivelProfissional = nivelProfissional;
    }

    public String recuperarNivel() {
        if (this.getScore() >= 90.0f)
            nivelProfissional.setNivel("Sênior");
        else
        if (this.getScore() >= 70.0f)
            nivelProfissional.setNivel("Pleno");
        else
        if (this.getScore() >= 50.0f)
            nivelProfissional.setNivel("Júnior");
        else
            nivelProfissional.setNivel("Trainee");
        return nivelProfissional.getNivel();
    }

    public void salvarNivel() {
        if (nivelProfissional.getNivel().equals("Sênior"))
            this.setScore(90.0f);
        else
        if (nivelProfissional.getNivel().equals("Pleno"))
            this.setScore(70.0f);
        else
        if (nivelProfissional.getNivel().equals("Júnior"))
            this.setScore(50.0f);
        else
            this.setScore(0.0f);
    }
}