package controle;

import modelo.Cliente;
import modelo.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cadastros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Dados do Cliente ===");
                    System.out.print("CPF: ");
                    String cpf = entrada.nextLine();
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = entrada.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = entrada.nextLine();
                    System.out.print("E-mail: ");
                    String email = entrada.nextLine();

                    Cliente cliente = new Cliente(cpf, nome, endereco, telefone, email);
                    listaClientes.add(cliente);

                    System.out.println("\n=== Dados do Veículo ===");
                    System.out.print("Placa: ");
                    String placa = entrada.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = entrada.nextLine();
                    System.out.print("Ano: ");
                    int ano = entrada.nextInt();
                    entrada.nextLine(); 
                    System.out.print("Fabricante: ");
                    String fabricante = entrada.nextLine();
                    System.out.print("Cor: ");
                    String cor = entrada.nextLine();

                    Veiculo veiculo = new Veiculo(placa, modelo, ano, fabricante, cor);
                    listaVeiculos.add(veiculo);

                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== Cadastros Realizados ===");
                    if (listaClientes.isEmpty()) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println("Cliente:");
                            listaClientes.get(i).exibirDados();
                            System.out.println("Veículo:");
                            listaVeiculos.get(i).exibirDados();
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}
