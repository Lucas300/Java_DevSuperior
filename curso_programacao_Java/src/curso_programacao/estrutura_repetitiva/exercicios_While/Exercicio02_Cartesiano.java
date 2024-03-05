package curso_programacao.estrutura_repetitiva.exercicios_While;

import java.util.Scanner;

public class Exercicio02_Cartesiano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int y = ler.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = ler.nextInt();
			y = ler.nextInt();
		}

		ler.close();
	}

}
