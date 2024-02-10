package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio03_Diferença {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		
		int diferenca = (a * b - c * d);
		System.out.println("Diferença = "+ diferenca);
		
		entrada.close();
	}

}
