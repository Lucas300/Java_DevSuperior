package curso_programacao.Desafios.Fibonacci_Calculator;

import java.util.Scanner;

public class FibonacciApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciCalculator calculator = new FibonacciCalculator();

        System.out.print("Digite o número de elementos da sequência de Fibonacci que você deseja gerar: ");
        int length = scanner.nextInt();

        int[] sequence = calculator.generateFibonacciSequence(length);

        System.out.println("Sequência de Fibonacci gerada:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }

        System.out.println();

        int sum = calculator.calculateSum(sequence);
        System.out.println("A soma de todos os números na sequência é: " + sum);
    }
}

