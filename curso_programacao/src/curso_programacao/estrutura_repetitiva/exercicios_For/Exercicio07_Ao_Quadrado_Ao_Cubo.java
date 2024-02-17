package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio07_Ao_Quadrado_Ao_Cubo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		for(int i = 1;i<=x;i++) {
			int quadrado = (int)Math.pow(i, 2);
			int cubo = (int)Math.pow(i, 3);
			System.out.printf("%d %d %d %n",i,quadrado,cubo);
		}
		
		
		ler.close();
	}

}
