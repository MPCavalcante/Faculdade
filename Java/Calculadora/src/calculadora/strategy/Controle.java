package calculadora.strategy;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        double a = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = input.nextDouble();

        System.out.println("\nResultados das operações:");

        // Soma
        calc.setOperacao(new Soma());
        System.out.println("+ Soma: " + calc.executar(a, b));

        // Subtração
        calc.setOperacao(new Subtracao());
        System.out.println("- Subtração: " + calc.executar(a, b));

        // Multiplicação
        calc.setOperacao(new Multiplicacao());
        System.out.println("X Multiplicação: " + calc.executar(a, b));

        // Divisão
        calc.setOperacao(new Divisao());
        try {
            System.out.println("/ Divisão: " + calc.executar(a, b));
        } catch (ArithmeticException e) {
            System.out.println("/ Divisão: Erro - " + e.getMessage());
        }

        input.close();
    }
}
