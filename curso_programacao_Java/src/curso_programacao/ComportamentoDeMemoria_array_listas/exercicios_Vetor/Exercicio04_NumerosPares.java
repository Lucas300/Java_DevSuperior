package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio04_NumerosPares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos numeros você vai digitar: ");
		int n = ler.nextInt();
		int totalPares = 0;
		int numeros[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			numeros[i] = ler.nextInt();
		}
		System.out.println("Numeros pares:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2 == 0) {
				System.out.print (numeros[i] +"  ");
				totalPares += 1;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares = "+totalPares);
		
		ler.close();
	}

}
