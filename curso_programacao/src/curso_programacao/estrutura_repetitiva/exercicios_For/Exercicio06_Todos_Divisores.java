package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio06_Todos_Divisores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		
		for(int i = 1; i <= x;i++) {
			if(x%i == 0) {
				System.out.println(i);
			}
		}
		
		ler.close();
	}

}
