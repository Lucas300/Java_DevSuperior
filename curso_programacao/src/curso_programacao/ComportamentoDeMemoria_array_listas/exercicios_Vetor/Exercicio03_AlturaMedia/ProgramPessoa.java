package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.Exercicio03_AlturaMedia;

import java.util.Scanner;

public class ProgramPessoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas?");
		int n = ler.nextInt();
		Pessoa[] vect = new Pessoa[n];
		String nome;
		int idade;
		double altura, total = 0;
		double contador = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome:");
			nome = ler.next();
			System.out.print("Digite a idade:");
			idade = ler.nextInt();
			System.out.print("Digite a altura:");
			altura = ler.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
			total = total + vect[i].getAltura();
			if (idade< 16) {
				contador += 1 ;
			}
		}
		double media = total / n; 
		int porcentagem =  (int)(contador / n * 100); 

		System.out.printf("Altura media: %.2f %n", media);
		System.out.printf("Pessoas com menos de 16 anos: %d",porcentagem);
		System.out.println("%");
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		ler.close();
	}

}
