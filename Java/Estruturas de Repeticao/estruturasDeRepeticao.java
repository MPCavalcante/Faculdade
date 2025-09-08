package fundamentos;

import java.util.Scanner;
 //Matheus Pereira Cavalcante

public class  estruturasDeRepeticao {

    public static void main(String[] args) {

        int[] votos = new int[7]; // Índices de 0 a 6

        Scanner scanner = new Scanner(System.in);
        int voto;

        System.out.println("Digite o número correspondente ao sistema operacional \n 0 - Encerrar \n 1 - Windows Server\n 2 - Unix\n 3 - Linux\n 4 - Netware\n 5 - Mac OS \n 6 - Outro");
        do {
            System.out.print("Digite um Número (0 a 6):  ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                System.out.print("Digite um Número (0 a 6): ");
            }
            voto = scanner.nextInt();

            if (voto < 0 || voto > 6) {
                System.out.println("Número inválido. Digite um número entre 1 a 6. sendo 0 para encerrar");
            } else if (voto != 0) {
                votos[voto]++;
            }
        } while (voto != 0);

         exibirResultados(votos);
    }

    private static void exibirResultados(int[] votos) {
        int totalVotos = 0;

        for (int i = 1; i < votos.length; i++) {
            totalVotos += votos[i];
        }

        if (totalVotos == 0) {
            System.out.println("Nenhum voto foi registrado.");
            return;
        }

            String[] opcoes = {
                "0 - Encerrar",
                "1 - Windows Server",
                "2 - Unix",
                "3 - Linux",
                "4 - Netware",
                "5 - Mac OS",
                "6 - Outro"
        };

        System.out.println("\nResultado de votos:");
        for (int i = 1; i < votos.length; i++) {
            double percentual = (votos[i] / (double) totalVotos) * 100;
            System.out.printf("%s: %d voto(s) (%.2f%%)%n", opcoes[i], votos[i], percentual);
        }
    }
}
