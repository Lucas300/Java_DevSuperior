package curso_programacao.ComportamentoDeMemoria_array_listas.exercicio_Listas;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("ID:");
		int id = ler.nextInt();
		System.out.print("Digite seu nome");
		String nome = ler.next();
		System.out.print("Digite seu nome salario");
		double salario = ler.nextDouble();		
		
		Funcionario func1 = new Funcionario(id,nome,salario);
//		
//		var id2 = 1;
//		System.out.println("Digite seu nome");
//		String nome2 = ler.next();
//		System.out.println("Digite seu nome salario");
//		double salario2 = ler.nextDouble();
//		
//		Funcionario func2 = new Funcionario(id2,nome2,salario2);
		
//		System.out.print("Enter the employee id that will have salary increase:");
//		int idSelect = 0;

		System.out.println("Enter the percentage:");
		int porcentagem = ler.nextInt();
		
		func1.aumentoPorPorcentagem(porcentagem);
		
		System.out.println(func1);
		
		
		ler.close();
	}

}
