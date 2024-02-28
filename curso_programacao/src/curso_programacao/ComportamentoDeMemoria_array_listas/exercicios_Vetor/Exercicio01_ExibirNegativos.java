package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor;

import java.util.Scanner;

public class Exercicio01_ExibirNegativos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos numeros você vai digitar?");
		int n = ler.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			num[i] = ler.nextInt();
		}
		System.out.println("Numeros negativos:");
		for (int i = 0; i < n; i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		ler.close();
	}

}
