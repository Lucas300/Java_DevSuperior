package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.Scanner;

public class Exercicio02_Soma_Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar?");
		int n = ler.nextInt();
		double soma = 0;
		double[] vetor = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextDouble();
			soma += vetor[i];
		}
		double media = soma / n;
		
		System.out.print("Valores =");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i]);
		}
		System.out.println();
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);

		ler.close();
	}

}
