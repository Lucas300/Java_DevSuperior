package curso_programacao.Topicos_Basicos;

import java.util.Scanner;

public class Funcoes_Sintaxe {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter Three Numbers: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();

		int maior = maior(a, b, c);
		ShowResult(maior);
		
		
		ler.close();
	}
	public static int maior(int a , int b, int c) {
		int aux = 0;
		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}

	public static void ShowResult(int value) {
		System.out.println("Higher: "+value);
	}
}
