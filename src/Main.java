import br.com.catolica.lojaDeConveniencia.Model.Enums.EformaDePagamento;
import br.com.catolica.lojaDeConveniencia.Model.Model.Cliente;
import br.com.catolica.lojaDeConveniencia.Model.Model.Entregador;
import br.com.catolica.lojaDeConveniencia.Model.Model.Gerente;
import br.com.catolica.lojaDeConveniencia.Model.Model.Usuiario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gu
public class Main {
    private static List<Usuiario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente("Gerente", "123456789");
        Cliente cliente = new Cliente("Cliente", "987654321");
        Entregador entregador = new Entregador("Entregador", "555555555");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar novo usuário");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome de usuário: ");
                    String user = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    usuarios.add(new Usuiario(user, senha));
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome de usuário: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String loginSenha = scanner.nextLine();
                    Usuiario usuario = autenticarUsuario(loginUser, loginSenha);

                    if (usuario != null) {
                        System.out.println("Login realizado com sucesso!");

                        while (true) {
                            System.out.println("Escolha uma opção:");
                            System.out.println("1. Login Gerente");
                            System.out.println("2. Realizar Compra (Cliente)");
                            System.out.println("3. Entregar Pedido (Entregador)");
                            System.out.println("4. Logout");
                            int acao = scanner.nextInt();
                            scanner.nextLine();

                            switch (acao) {
                                case 1:
                                    System.out.println("Digite o nome do item para adicionar ao estoque:");
                                    String itemGerente = scanner.nextLine();
                                    gerente.adicionarItem(itemGerente);
                                    gerente.listarItens();
                                    break;
                                case 2:
                                    System.out.println("Digite o nome do item para compra:");
                                    String itemCliente = scanner.nextLine();
                                    cliente.realizarCompra(itemCliente);

                                    System.out.println("Escolha a forma de pagamento:");
                                    System.out.println("1. Dinheiro");
                                    System.out.println("2. Cartão");
                                    int formaPagamentoOpcao = scanner.nextInt();
                                    EformaDePagamento formaDePagamento = (formaPagamentoOpcao == 1) ? EformaDePagamento.Dinheiro : EformaDePagamento.Cartao;

                                    cliente.realizarPagamento(10.0, formaDePagamento);
                                    break;
                                case 3:
                                    System.out.println("Digite o endereço para entrega:");
                                    String endereco = scanner.nextLine();
                                    entregador.entregarPedido(endereco);
                                    break;
                                case 4:
                                    System.out.println("Logout realizado.");
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                            }
                            if (acao == 4) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static Usuiario autenticarUsuario(String user, String senha) {
        for (Usuiario usuario : usuarios) {
            if (usuario.getUsername().equals(user) && usuario.validarSenha(senha)) {
                return usuario;
            }
        }
        return null;
    }
}