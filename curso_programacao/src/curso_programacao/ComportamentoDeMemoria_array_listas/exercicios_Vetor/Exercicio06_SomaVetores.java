package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio06_SomaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o tamanho dos vetores?");
		int n = ler.nextInt();
		int vetor1[] = new int[n];
		int vetor2[] = new int[n];
		int soma[] = new int[n];
		System.out.println("Digite os valores do vetorA:");
		for (int i = 0; i < n; i++) {
			vetor1[i] = ler.nextInt();
		}
		System.out.println("Digite os valores do vetorB:");
		for (int i = 0; i < n; i++) {
			vetor2[i] = ler.nextInt();
		}
		
		System.out.println("Vetor Resultante:");
		for (int i = 0; i < n; i++) {
			soma[i] = vetor1[i] + vetor2[i];
			System.out.println(soma[i]);
		}
		
		ler.close();
	}

}
