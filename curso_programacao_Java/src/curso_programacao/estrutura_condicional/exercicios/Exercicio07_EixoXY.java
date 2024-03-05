package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio07_EixoXY {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x = ler.nextDouble();
		double y = ler.nextDouble();
		String mensagem;
		
		if(x > 0 && y > 0) {
			mensagem = "Q1";
		}else if(x < 0 && y > 0){
			mensagem = "Q2";
		}else if(x < 0 && y < 0) {
			mensagem = "Q3";
		}else if(x > 0 && y < 0) {
			mensagem = "Q4";
		}else {
			mensagem = "Origem";
		}
		System.out.println(mensagem);
		
		ler.close();
	}

}
