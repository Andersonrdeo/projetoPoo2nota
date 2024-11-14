package br.com.catolica.lojaDeConveniencia.Model.Model;

public abstract class Lanche {
    protected String nome;
    protected double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void preparar();
}
