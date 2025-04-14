package org.example;

public class Carro {
    protected String marca;
    protected String tipoCombustivel;

    public Carro(String marca, String tipoCombustivel) {
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }
}

