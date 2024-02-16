package curso_programacao.estrutura_repetitiva.exercicios_While;

import java.util.Scanner;

public class Exercicio01_senha_valida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt(); 
		while(n != 2002) {
			System.out.println("Senha inválida");
			n = ler.nextInt(); 
			
		}
		System.out.println("Acesso Permitido");
		
		
		ler.close();
	}

}
