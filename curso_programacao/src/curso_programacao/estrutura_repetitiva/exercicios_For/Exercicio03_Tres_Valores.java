package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio03_Tres_Valores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		double a, b, c;

		for (int i = 0; i < x; i++) {
			a = ler.nextDouble();
			b = ler.nextDouble();
			c = ler.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}

		ler.close();
	}

}
