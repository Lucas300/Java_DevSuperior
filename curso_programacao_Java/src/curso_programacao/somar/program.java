package curso_programacao.somar;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro numero:");//print
		int n1 = ler.nextInt();  //leitura
		
		System.out.print("Digite o primeiro numero:");//print
		int n2 = ler.nextInt();  //leitura

		Soma soma1 = new Soma(n1,n2);
		
		System.out.println("SOMA = " + soma1.Somar());
	}

}
