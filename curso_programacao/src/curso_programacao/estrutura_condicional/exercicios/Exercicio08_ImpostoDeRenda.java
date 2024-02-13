package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio08_ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario = ler.nextDouble();
		double imposto = 00;
		
		if(salario > 00 && salario <= 2000) {
			
		}else if(salario >= 2000.01 && salario <= 3000) {
			imposto = (salario - 2000.0) * 0.08;
		}else if(salario >= 3000.01 && salario <= 4500) {
			imposto =  (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else{
			imposto =(salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; ;
		}
		System.out.printf("Imposto = %.2f",imposto);
		ler.close();
	}

}
