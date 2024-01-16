package DesignPatterns.src;

import DesignPatterns.builders.BuilderCarro;
import DesignPatterns.builders.BuilderCarroEsportivo;
import DesignPatterns.builders.Carro;
import DesignPatterns.builders.Diretor;

public class App {
    public static void app(String[] args) {
        BuilderCarro builderEsportivo = new BuilderCarroEsportivo();
        Diretor diretor = new Diretor(builderEsportivo);

        diretor.construirCarro();
        Carro carroEsportivo = builderEsportivo.obterCarro();

        System.out.println(carroEsportivo);
    }
}