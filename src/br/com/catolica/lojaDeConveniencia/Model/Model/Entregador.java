package br.com.catolica.lojaDeConveniencia.Model.Model;

public class Entregador extends Funcionario {
    public Entregador(String nome, String cpf) {
        super(nome, cpf);
    }

    public void entregarPedido(String endereco) {
        System.out.println("Pedido entregue no endereço: " + endereco);
    }
}
