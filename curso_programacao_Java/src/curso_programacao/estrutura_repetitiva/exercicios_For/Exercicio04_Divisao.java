package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio04_Divisao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int a, b;

		for (int i = 0; i < x; i++) {
			a = ler.nextInt();
			b = ler.nextInt();
			double div;
			if (b == 0) {
				System.out.println("Divisão Impossivel");
			} else {
				div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
		}

		ler.close();
	}

}
