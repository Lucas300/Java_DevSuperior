package curso_programacao.ComportamentoDeMemoria_array_listas.Exercicio_Matriz;

import java.util.Scanner;

public class Matriz_Alturas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = ler.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n],menores = 0;
		float altura[] = new float[n],soma_altura = 0;
		
		for(int contador = 0;contador <n; contador++) {
			System.out.println("Dados da "+(contador+1)+"º Pessoa:");
			System.out.print("nome: ");
			nome[contador]=ler.next();
			System.out.print("idade: ");
			idade[contador] = ler.nextInt();
			System.out.print("altura: ");
			altura[contador] = ler.nextFloat();
			
			
			soma_altura = soma_altura+altura[contador];
			
			
			if(idade[contador]<16) {
				menores = menores + 1;
			}
		}
		float porcentagem = (float)((menores/(float)n)*100.00);
		System.out.println("Altura media: "+(soma_altura/n));
		System.out.println("Pessoas com menos de 16 anos: "+(porcentagem)+"%");
		for(int contador = 0;contador <n;contador++) {
			if(idade[contador]<16) {
				System.out.println(nome[contador]);
			}	

	}
	}

}
