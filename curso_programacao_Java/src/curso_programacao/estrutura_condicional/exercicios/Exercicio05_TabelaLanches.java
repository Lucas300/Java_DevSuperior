package curso_programacao.estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio05_TabelaLanches {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o código:");
		int cod = ler.nextInt();
		System.out.print("Digite a quantidade:");
		int qtd = ler.nextInt();
		double total = 0;
		String mensagem = "";
		switch (cod) {
		case 1:
			total += (4.00 * qtd);
			break;
		case 2:
			total += (4.50 * qtd);			
			break;
		case 3:
			total += (5.00 * qtd);
			break;
		case 4:
			total += (2.00 * qtd);
			break;
		case 5:
			total += (1.50 * qtd);
			break;
		default:
			mensagem = "Código Inválido";
			break;
		}
		System.out.println("Total R$:"+total+" "+mensagem);
		
		ler.close();

	}

}
