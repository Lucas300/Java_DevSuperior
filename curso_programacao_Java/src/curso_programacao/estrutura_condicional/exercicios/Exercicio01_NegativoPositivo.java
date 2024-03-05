package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio01_NegativoPositivo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		if(n < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		entrada.close();
	}

}
