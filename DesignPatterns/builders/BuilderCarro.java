package DesignPatterns.builders;

public interface BuilderCarro {
    void criarCarro();

    void construirMotor();

    void construirRodas();

    void pintarCarro();

    Carro obterCarro();
}