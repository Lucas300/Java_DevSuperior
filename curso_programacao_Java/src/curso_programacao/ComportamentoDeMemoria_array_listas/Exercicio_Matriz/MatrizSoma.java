package curso_programacao.ComportamentoDeMemoria_array_listas.Exercicio_Matriz;

import java.util.Scanner;

public class MatrizSoma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas linhas vai ter cada matriz");
		int linha =  ler.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz");
		int coluna =  ler.nextInt();
		
		int[][] matrizA = new int[linha][coluna];
		int[][] matrizB = new int[linha][coluna];
		int[][] matriz_soma = new int[linha][coluna];
		
		System.out.println("Digite os valores da Matriz A");
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.printf("Elemento [%d,%d]:",i,j);
				matrizA[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("Digite os valores da Matriz B");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.printf("Elemento [%d,%d]:",i,j);
				matrizB[i][j] = ler.nextInt();
			}
		}
		
		System.out.println("Matriz soma:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz_soma[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matriz_soma[i][j]+" ");
			}
			System.out.println();
		}
		
		
		ler.close();
	}

}
