package curso_programacao.estrutura_sequencial;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//entrada tipo String
		System.out.print("Digite seu nome: ");
		String x = sc.next();
		
		//entrada tipo Int
		System.out.print("Digite sua idade: ");
		int y = sc.nextInt();
		
		//entrada tipo double
		System.out.print("Digite seu salário: ");		
		double z = sc.nextDouble();
		
		System.out.println(x + " tem "+ y + " e ganha R$:"+ z);
		
		sc.close();
	}

}
