package curso_programacao.ComportamentoDeMemoria_array_listas.Exercicio_Matriz;

import java.util.Scanner;

public class Matriz_Maior_elemento_cada_Linha {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual a Ordem da matriz? ");
		int ordem = ler.nextInt();
			
		int[][] matriz = new int[10][10];
		int maior[] = new int[10];
		int contador = 0;
		
		for(int i = 0;i<ordem;i++) {
			for(int j = 0;j<ordem;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.println("Maior elemento de cada Linha:");
		for(int i = 0;i<ordem;i++) {
			maior[i] = matriz[i][1];
			for(int j = 0;j<ordem;j++) {
				if(matriz[i][j]>maior[i]) {
					maior[i] = matriz[i][j];
					contador = contador+1; 
				}
			}
		}
		for(int i = 0; i<(contador-1);i++) {
			System.out.println(maior[i]);
		}
	}

}
