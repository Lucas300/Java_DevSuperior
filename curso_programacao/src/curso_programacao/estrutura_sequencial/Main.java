package curso_programacao.estrutura_sequencial;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		Locale.setDefault(Locale.US);// p ara ter . em vez de , na exibição
		System.out.printf("%s tem %d e ganha R$: %.2f %n",nome,idade,renda);
	}

}
