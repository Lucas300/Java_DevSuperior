package curso_programacao.Introducao_a_POO.exercicios.saida;

import java.util.Scanner;

import curso_programacao.Introducao_a_POO.exercicios.classes.Funcionario;

public class Funcionario_programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.print("Name:");
		funcionario.name = ler.nextLine();
		System.out.print("Gross salary:");
		funcionario.salary = ler.nextDouble();
		System.out.print("Tax:");
		funcionario.tax = ler.nextDouble();
		System.out.println();
		System.out.println(funcionario);
		System.out.println();
		
		System.out.print("Which percentage to increase salary?");
		double quantidade = ler.nextDouble();
		System.out.println();
		
		funcionario.IncreaseSalary(quantidade);
		System.out.println("Updated data:"+funcionario.toString());
		
		ler.close();
	}

}
