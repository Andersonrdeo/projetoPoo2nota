package br.com.catolica.lojaDeConveniencia.Model.Model;

public abstract class Bebida {
    protected String nome;
    protected double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void servir();
}
