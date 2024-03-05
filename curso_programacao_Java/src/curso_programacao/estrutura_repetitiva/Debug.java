package curso_programacao.estrutura_repetitiva;

import java.util.Scanner;

public class Debug {
	public static void main(String[] args) {
		//perspective debug e f6 para passar a linha
		// tem que colocar um break point
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}
}
