package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio08_MediaDosPares {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o tamanho dos vetores?");
		int n = ler.nextInt();
		int vetor[] = new int[n];
		int total = 0, contadorDePares = 0,mediaPares;
		for (int i = 0; i < n; i++) {
			vetor[i] = ler.nextInt();
			if (vetor[i]%2==0) {
				total += vetor[i];
			}
			contadorDePares+= 1;
		}
		mediaPares = total/contadorDePares;
		if (total == 0) {
			System.out.println("Nenhum numero par");
		}else {
			System.out.println("Media dos pares = "+mediaPares);
		}
	}

}
