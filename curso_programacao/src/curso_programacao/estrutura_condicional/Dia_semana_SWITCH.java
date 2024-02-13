package curso_programacao.estrutura_condicional;

import java.util.Scanner;

public class Dia_semana_SWITCH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		String mensagem;

		switch (dia) {
		case 1:
			mensagem = "Domingo";
			break;
		case 2:
			mensagem = "Segunda";
			break;
		case 3:
			mensagem = "Terça";
			break;
		case 4:
			mensagem = "Quarta";
			break;
		case 5:
			mensagem = "Quinta";
			break;
		case 6:
			mensagem = "Sexta";
			break;
		case 7:
			mensagem = "Sábado";
			break;
		default:
			mensagem = "Dia Inválid0";
			break;
		}
		System.out.println(mensagem);
		entrada.close();

	}

}
