package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.Scanner;

public class Vetores {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		double total = 0;
		//vetor
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			altura[i] = ler.nextDouble();
			total = total + altura[i];
		}
		double media = total / n;
		System.out.printf("Average height = %.2f", media);
	
		ler.close();
	}

}
