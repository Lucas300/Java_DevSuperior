package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio05_valorTotalPecas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo1 = entrada.nextInt();
		int quantidade1 = entrada.nextInt();
		double preco1 = entrada.nextDouble();
		double total1 = quantidade1 * preco1;
		
		int codigo2 = entrada.nextInt();
		int quantidade2 = entrada.nextInt();
		double preco2 = entrada.nextDouble();
		double total2 = quantidade2 * preco2;
		
		var total = total1 + total2;
		System.out.println("Valor a pagar R$:"+total);
		
		entrada.close();
	}

}
