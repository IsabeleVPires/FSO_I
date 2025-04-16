public class Main {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Leão", Habitat.TERRESTRE, 5, "Amarela");
        Ave arara = new Ave("Arara", Habitat.AEREO, 2, "Colorida");

        leao.emitirSom();
        leao.mover();
        leao.exibirDetalhes();

        System.out.println();

        arara.emitirSom();
        arara.mover();
        arara.exibirDetalhes();
    }
}
