package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.Vetor_com_Classes;

import java.util.Scanner;

import curso_programacao.ComportamentoDeMemoria_array_listas.ClasseProduto;

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
			if (vect[i].getAltura() < 16) {
				contador++;
			}
		}
		double media = total / n;
		double porcentagem = contador/n;
		System.out.println("Altura media: "+media);
		System.out.println("Pessoas com menos de 16 anos:"+porcentagem);
		for (int i = 0; i < n; i++) {
			if(vect[i].getAltura() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		ler.close();
	}

}
