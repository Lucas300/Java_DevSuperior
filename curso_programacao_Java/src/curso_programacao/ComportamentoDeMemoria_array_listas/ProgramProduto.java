package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.Scanner;

public class ProgramProduto {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		ClasseProduto[] vect = new ClasseProduto[n];
		
		for (int i = 0; i < n; i++) {
			ler.nextLine();
			String name = ler.nextLine();
			double price = ler.nextDouble();
			//instanciando um objeto vetor 
			vect[i] = new ClasseProduto(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double media = sum/n;
		System.out.println("Média = "+media);
		
		ler.close();
	}

}
