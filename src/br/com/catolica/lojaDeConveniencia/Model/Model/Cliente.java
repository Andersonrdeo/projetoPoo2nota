package br.com.catolica.lojaDeConveniencia.Model.Model;

import br.com.catolica.lojaDeConveniencia.Model.Contrato.Ipagamento;
import br.com.catolica.lojaDeConveniencia.Model.Enums.EformaDePagamento;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void realizarCompra(String item) {
        System.out.println(nome + " comprou o item: " + item);
    }

    public void realizarPagamento(double valor, EformaDePagamento formaDePagamento) {
        System.out.println("Pagamento de R$" + valor + " realizado com " + formaDePagamento);
    }
}