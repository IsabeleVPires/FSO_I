public class Main {
    public static void main(String[] args) {
        Mamifero golfinho = new Mamifero("Golfinho", Habitat.AQUATICO, 8, "Cinza");
        Ave pinguim = new Ave("Pinguim", Habitat.AQUATICO, 3, "Preto e branco");

        golfinho.emitirSom();
        golfinho.mover();
        golfinho.exibirDetalhes();

        System.out.println();

        pinguim.emitirSom();
        pinguim.mover();
        pinguim.exibirDetalhes();
    }
}
