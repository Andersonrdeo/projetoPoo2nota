package br.com.catolica.lojaDeConveniencia.Model.Model;

import br.com.catolica.lojaDeConveniencia.Model.Contrato.IperfilGerencial;

public class Gerente extends Funcionario implements IperfilGerencial {
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public void adicionarItem(String item) {
        System.out.println("Item " + item + " adicionado ao estoque.");
    }

    public void removerItem(String item) {
        System.out.println("Item " + item + " removido do estoque.");
    }

    public void listarItens() {
        System.out.println("Listando itens do estoque...");
    }
}
