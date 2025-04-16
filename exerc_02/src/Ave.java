public class Ave extends AnimalBase {
    private String corDasPenas;

    public Ave(String nome, Habitat habitat, int idade, String corDasPenas) {
        super(nome, habitat, idade);
        this.corDasPenas = corDasPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " pia como uma ave.");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ave: " + nome + ", Cor das penas: " + corDasPenas + ", Idade: " + getIdade() + ", Habitat: " + habitat);
    }
}
