package DesignPatterns.builders;

public class Carro {
    String modelo;
    String motor;
    String rodas;
    String cor;

    @Override
    public String toString() {
        return String.format("Carro: %s, Motor: %s, Rodas: %s, Cor: %s", modelo, motor, rodas, cor);
    }
}