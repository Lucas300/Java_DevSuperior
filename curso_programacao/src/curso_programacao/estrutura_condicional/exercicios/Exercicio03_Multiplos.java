package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio03_Multiplos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		String mensagem;
		if(n1%n2 == 0) {
			mensagem = "São multiplos";
		}else if(n2%n1 == 0) {
			mensagem = "São multiplos";
		}else {
			mensagem = "Não são multiplos";
		}
		System.out.println(mensagem);
		ler.close();

	}

}
