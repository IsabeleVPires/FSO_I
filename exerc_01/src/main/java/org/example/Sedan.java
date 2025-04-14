package org.example;

public class Sedan extends Carro {
    private int capacidadePortaMalas;

    public Sedan(String marca, int capacidadePortaMalas) {
        super(marca, "Gasolina"); // tipo de combustível
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidade do porta-malas: " + capacidadePortaMalas + " litros");
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}

