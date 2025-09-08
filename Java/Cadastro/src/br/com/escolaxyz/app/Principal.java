package br.com.escolaxyz.app;

import br.com.escolaxyz.model.Aluno;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Aluno ===");
        System.out.print("Nome do aluno OU (ENTER para exemplo): ");
        String nome = sc.nextLine();
        if (nome.isBlank()) nome = "Matheus Pereira";

        System.out.print("Endereço residencial OU (ENTER para exemplo): ");
        String endereco = sc.nextLine();
        if (endereco.isBlank()) endereco = "Parque Rio Branco, 1006 - Valparaiso - GO";

        System.out.print("Telefone de contato OU (ENTER para exemplo): ");
        String telefone = sc.nextLine();
        if (telefone.isBlank()) telefone = "(61) 98106-6029";

        System.out.print("E-mail OU (ENTER para exemplo): ");
        String email = sc.nextLine();
        if (email.isBlank()) email = "mpcavalcante@gmail.com";

        System.out.print("Matrícula OU (ENTER para exemplo): ");
        String matricula = sc.nextLine();
        if (matricula.isBlank()) matricula = "ATIVIDADE2025";

        
        Aluno aluno = new Aluno(nome, endereco, telefone, email, matricula);

        System.out.println();
        System.out.println("Aluno cadastrado com sucesso:");
        System.out.println(aluno.toString());

        sc.close();
    }
}
