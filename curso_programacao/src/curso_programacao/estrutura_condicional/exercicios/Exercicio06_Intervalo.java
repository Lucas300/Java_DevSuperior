package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio06_Intervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n = ler.nextDouble();
		String mensagem;
		if (n >= 0 && (n <= 25)) {
			mensagem = "Intervalo de (0,25)";
		} else if (n > 25 && (n <= 50)) {
			mensagem = "Intervalo de (25,50)";
		} else if (n > 50 && (n <= 75)) {
			mensagem = "Intervalo de (50,75)";
		} else if (n > 75 && (n <= 100)) {
			mensagem = "Intervalo de (75,100)";
		}else {
			mensagem = "Fora do Intervalo";
		}
		System.out.println(mensagem);
		ler.close();
	}

}
