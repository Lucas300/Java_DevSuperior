package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.Scanner;

public class MatrizNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite as linhas:");
		int m = ler.nextInt();
		System.out.print("Digite as colunas:");
		int n = ler.nextInt();
		int[][] matriz = new int[m][n];

		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Digite o [%d,%d]:",i,j);
				matriz[i][j] = ler.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		
		
		
		ler.close();
	}

}
