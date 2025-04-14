package org.example;

public class Main {
    public static void main(String[] args) {
        Sedan meuSedan = new Sedan("Toyota", 450);

        meuSedan.ligar();
        meuSedan.exibirDetalhes();
        meuSedan.desligar();
    }
}
