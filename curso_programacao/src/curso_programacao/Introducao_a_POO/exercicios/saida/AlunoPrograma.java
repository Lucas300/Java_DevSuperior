package curso_programacao.Introducao_a_POO.exercicios.saida;

import java.util.Scanner;

import curso_programacao.Introducao_a_POO.exercicios.classes.Aluno;

public class AlunoPrograma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Alex Green");
		aluno.nota1 = ler.nextDouble();
		aluno.nota2 = ler.nextDouble();
		aluno.nota3 = ler.nextDouble();
		
		System.out.println(aluno.verificarNota());
		ler.close();
	}

}
