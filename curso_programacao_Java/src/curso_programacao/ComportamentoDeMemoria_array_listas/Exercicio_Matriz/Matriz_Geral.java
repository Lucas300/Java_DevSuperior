package curso_programacao.ComportamentoDeMemoria_array_listas.Exercicio_Matriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matriz_Geral {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.print("Qual a ordem da matriz? ");
			int ordem = ler.nextInt();
			float matriz[][] = new float[10][10];
			float soma = 0;
			int linha,coluna;
			
			for(int i = 0;i< ordem ;i++) {
				for(int j = 0; j< ordem; j++) {
					System.out.print("Elemento ["+i+","+j+"]: ");
					matriz[i][j] = ler.nextFloat();
					if(matriz[i][j]>0) {
						soma = soma + matriz[i][j];
					}
				}
			}
			System.out.println("SOMA DOS POSITIVOS: "+soma);
			
			System.out.print("Escolha uma linha: ");
			linha = ler.nextInt();
			for(int i = 0; i< ordem ;i++) {
				System.out.print(matriz[linha][i]+" ");
			}
			System.out.println(" ");
			
			System.out.print("Escolha a coluna: ");
			coluna = ler.nextInt();
			for(int i = 0; i< ordem ;i++) {
				System.out.print(matriz[i][coluna]+" ");
			}
			
			System.out.println("  ");
			System.out.println("Matriz Alterada: ");
			for(int i = 0;i< ordem ;i++) {
				for(int j = 0; j< ordem; j++) {
					if(matriz[i][j]<0) {
						matriz[i][j] = matriz[i][j]*matriz[i][j];
					}
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println(" ");
			}

	}

}
