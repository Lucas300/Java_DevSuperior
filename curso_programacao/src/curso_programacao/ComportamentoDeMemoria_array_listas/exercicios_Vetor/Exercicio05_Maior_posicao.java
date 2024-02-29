package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio05_Maior_posicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos numeros você vai digitar: ");
		int n = ler.nextInt();
		double maior = 0;
		double numeros[] = new double[n];
		int posicao = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			numeros[i] = ler.nextDouble();
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("Maior valor = "+maior);
		System.out.println("posição do maior valor = "+posicao);
		
		
		
		ler.close();

	}

}
