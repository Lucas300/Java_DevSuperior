package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio02_Par_Impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long n = ler.nextLong();
		if(n%2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		ler.close();
	}

}
