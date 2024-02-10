package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio01_soma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma, n1, n2;
		System.out.println("Entrada:");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		
		soma = n1 + n2;
		System.out.println("Soma = "+ soma);
		entrada.close();
	}

}
