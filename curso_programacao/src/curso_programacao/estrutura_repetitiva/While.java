package curso_programacao.estrutura_repetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();;
		int soma_dos_numeros = 0;
		
		//Repete enquanto o n for diferente de 0
		while(n != 0) {
			soma_dos_numeros += n;
			n = sc.nextInt();
		}
		System.out.println("A soma dos números digitados é:"+soma_dos_numeros);
		
		
		sc.close();
	}

}
