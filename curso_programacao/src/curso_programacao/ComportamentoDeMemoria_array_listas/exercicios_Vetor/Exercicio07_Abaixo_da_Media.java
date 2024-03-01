package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio07_Abaixo_da_Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o tamanho dos vetores?");
		int n = ler.nextInt();
		double vetor[] = new double[n];
		double soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = ler.nextDouble();
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.println("Media do vetor = " + media);
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		ler.close();
	}

}
