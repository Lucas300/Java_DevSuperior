package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio01_Impares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		for (int i = 0; i < x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);				
			}
		}

		ler.close();
	}

}
