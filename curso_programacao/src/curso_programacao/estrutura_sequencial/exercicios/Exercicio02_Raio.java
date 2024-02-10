package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio02_Raio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final double Valor_final,n,pi = 3.14159;
		
		System.out.println("Entrada:");
		n = entrada.nextDouble();
		
		Valor_final = pi * Math.pow(n, 2);
		System.out.printf("A = %.4f",Valor_final);
		
		entrada.close();

	}

}
