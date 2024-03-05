package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.Exercicio09_MaisVelho;

import java.util.Scanner;

public class PessoaMaisAlta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar?");
		int n = ler.nextInt();
		String nome;
		int idade,maiorIdade = 0,maisVelho = 0;
		Pessoa[] pessoa = new Pessoa[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dº Pessoa %n",i+1);
			System.out.print("Nome:");
			nome = ler.next();
			System.out.print("Idade:");
			idade = ler.nextInt();
			pessoa[i] = new Pessoa(nome,idade);
			if(idade > maiorIdade) {
				maiorIdade = idade;	
				maisVelho = i;
			}
		}
		System.out.println("Pessoa mais velha: "+pessoa[maisVelho].getNome());
		
		
		
		
		ler.close();
	}

}
