package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.Exercicio10_Aprovados;

import java.util.Scanner;

public class AlunosAprovados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados?");
		int n = ler.nextInt();
		double n1,n2;
		String nome;
		Aluno[] aluno = new Aluno[n]; 
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:",i+1);
			nome = ler.next();
			n1 = ler.nextDouble();
			n2 = ler.nextDouble();
			aluno[i] = new Aluno(nome, n1, n2);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if(aluno[i].media() >= 6) {
				System.out.println(aluno[i].getNome());
			}
		}
		
		

		ler.close();
	}

}
