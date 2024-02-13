package curso_programacao.estrutura_condicional;

import java.util.Scanner;

public class Dia_semana_IF_ELSE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		String mensagem;
		
		if(dia == 1) {
			mensagem = "Domingo";
		}
		else if(dia == 2) {
			mensagem = "Segunda";			
		}
		else if(dia == 3) {
			mensagem = "Terça";			
		}
		else if(dia == 4) {
			mensagem = "Quarta";			
		}
		else if(dia == 5) {
			mensagem = "Quinta";			
		}
		else if(dia == 6) {
			mensagem = "Sexta";			
		}
		else if(dia == 7) {
			mensagem = "Sábado";			
		}
		else {
			mensagem = "Inválido";			
		}
		System.out.println(mensagem);
		entrada.close();
	}

}
