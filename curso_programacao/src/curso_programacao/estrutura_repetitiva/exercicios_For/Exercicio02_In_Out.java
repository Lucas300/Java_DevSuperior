package curso_programacao.estrutura_repetitiva.exercicios_For;

import java.util.Scanner;

public class Exercicio02_In_Out {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int in = 0,out = 0;
		for(int i = 0; i < x;i++) {
			int n = ler.nextInt();
			if (n >= 10 && n<=20) {
				in++;
			}else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		ler.close();
	}

}
