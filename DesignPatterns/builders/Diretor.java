package DesignPatterns.builders;

public class Diretor {
    private BuilderCarro builder;

    public Diretor(BuilderCarro builder) {
        this.builder = builder;
    }

    public void construirCarro() {
        builder.criarCarro();
        builder.construirMotor();
        builder.construirRodas();
        builder.pintarCarro();
    }
}