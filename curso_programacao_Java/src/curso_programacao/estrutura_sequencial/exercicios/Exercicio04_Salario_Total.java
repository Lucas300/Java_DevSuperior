package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio04_Salario_Total {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nHoras = entrada.nextDouble();
		double horasTrabalhadas = entrada.nextDouble();
		double ganhaHora = entrada.nextDouble();
		double salarioTotal = horasTrabalhadas * ganhaHora;
		
		System.out.println("NUMBER = " + nHoras);
		System.out.println("SALARY = $"+ salarioTotal);
		
		entrada.close();
	}

}
