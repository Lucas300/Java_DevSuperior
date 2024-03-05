package curso_programacao.estrutura_repetitiva;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s = "";
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = ler.nextDouble();
			double f = (9 * c / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f %n", f);
			System.out.print("Deseja Repetir(S/N)?");
			s = ler.next();
		} while ("s".equals(s));

		ler.close();
	}

}
