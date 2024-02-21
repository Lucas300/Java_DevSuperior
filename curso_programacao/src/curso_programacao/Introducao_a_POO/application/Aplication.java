package curso_programacao.Introducao_a_POO.application;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//instanciando objeto e colocando dados nos atributos
		Produto product = new Produto();
		System.out.print("Name: ");
		product.name = ler.next();
		System.out.print("Price: ");
		product.price = ler.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = ler.nextInt();
		
		//exibindo o valor do toString();
		System.out.println("Data: "+product);
		System.out.println();
		
		//perguntando quantos o usuario vai adicionar a mais
		System.out.print("Enter the number of product to be added in stock:");
		int add = ler.nextInt();
		product.addProducts(add);
		//exibindo dados atualizados
		System.out.println("Updated data: "+product);
		System.out.println();
		
		System.out.print("Enter the number of product to be removed from stock:");
		int remove = ler.nextInt();
		product.removeProducts(remove);
		//exibindo dados atualizados
		System.out.println("Updated data: "+product);

		ler.close();
	}

}
