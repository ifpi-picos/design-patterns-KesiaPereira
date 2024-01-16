package DesignPatterns.builders;

public class BuilderCarroEsportivo implements BuilderCarro {
    private Carro carro;

    @Override
    public void criarCarro() {
        carro = new Carro();
    }

    @Override
    public void construirMotor() {
        carro.motor = "Motor Potente";
    }

    @Override
    public void construirRodas() {
        carro.rodas = "Rodas Esportivas";
    }

    @Override
    public void pintarCarro() {
        carro.cor = "Vermelho";
    }

    @Override
    public Carro obterCarro() {
        return carro;
    }
}