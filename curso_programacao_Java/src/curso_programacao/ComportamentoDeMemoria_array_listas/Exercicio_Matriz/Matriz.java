package curso_programacao.ComportamentoDeMemoria_array_listas.Exercicio_Matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite as linhas:");
		int l = ler.nextInt();
		System.out.print("Digite as colunas:");
		int c = ler.nextInt();
		int[][] matriz = new int[l][c];
		int contadorNegativos = 0;
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("Digite o [%d,%d]:",i,j);
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.println("Main diagonal");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (i == j) {
					System.out.print(matriz[i][j]+" ");					
				}
				if (matriz[i][j] < 0) {
					contadorNegativos += 1;
				}
			}
			System.out.println();
		}
		System.out.println("Negative numbers = "+contadorNegativos);
	
		
		
		
		
		ler.close();
	}

}
