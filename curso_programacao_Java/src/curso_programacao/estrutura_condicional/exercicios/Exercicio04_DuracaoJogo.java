package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio04_DuracaoJogo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		int horas = 24;
		if (n1 > n2) {
			horas = horas -(n1 -n2);
		}
		else if(n2 > n1) {
			horas = n2 - n1;
		}
		System.out.println("O jogo Durou " +horas+" horas ");
		
		
		ler.close();
	}

}
