package curso_programacao.Introducao_a_POO.exercicioFinal;

import java.util.Scanner;

public class CotacaoDolar {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		System.out.print("What is the dollar price: ");
		cc.dollar = ler.nextDouble();
		System.out.print("How many dollars will be bought: ");
		cc.quantidade = ler.nextDouble();
		
		double total = cc.conversion(cc.dollar, cc.quantidade);
		System.out.printf("Amount to paid in reais: %.2f",total);
		
		
		
		ler.close();
	}
}	
