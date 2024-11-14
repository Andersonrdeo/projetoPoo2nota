package br.com.catolica.lojaDeConveniencia.Model.Model;

public class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void realizarAtendimento() {
        System.out.println("Atendimento realizado por " + this.nome);
    }
}
