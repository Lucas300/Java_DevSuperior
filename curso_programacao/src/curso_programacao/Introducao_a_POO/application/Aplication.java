package curso_programacao.Introducao_a_POO.application;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto product = new Produto();
		System.out.print("Name: ");
		product.name = ler.next();
		System.out.print("Price: ");
		product.price = ler.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = ler.nextInt();
		
		product.addProducts(0);
		product.removeProducts(0);
		
		System.out.println(product.totalValueInStock());
		
		ler.close();
	}

}
