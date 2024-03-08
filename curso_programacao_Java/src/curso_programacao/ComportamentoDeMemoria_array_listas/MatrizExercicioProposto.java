package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.Scanner;

public class MatrizExercicioProposto {

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
		System.out.print("Entre com o valor de X:");
		int x = ler.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}	
		ler.close();
	}

}
