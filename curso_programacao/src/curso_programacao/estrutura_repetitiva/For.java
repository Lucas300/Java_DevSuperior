package curso_programacao.estrutura_repetitiva;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			int x = ler.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		ler.close();
	}

}
