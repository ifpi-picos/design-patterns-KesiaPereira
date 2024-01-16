public class App {
    public static void main(String[] args) {
        BuilderCarro builderEsportivo = new BuilderCarroEsportivo();
        Diretor diretor = new Diretor(builderEsportivo);

        diretor.construirCarro();
        Carro carroEsportivo = builderEsportivo.obterCarro();

        System.out.println(carroEsportivo);
    }
}