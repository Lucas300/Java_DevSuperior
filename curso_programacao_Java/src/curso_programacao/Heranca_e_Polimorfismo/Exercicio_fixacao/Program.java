package curso_programacao.Heranca_e_Polimorfismo.Exercicio_fixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #"+(i+1)+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = ler.next().charAt(0);
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Price: ");
			double price = ler.nextDouble();
			if(ch == 'c') {
				Product pro = new Product(name, price);
				list.add(pro);
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				LocalDate date = LocalDate.parse(ler.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product pro = new UsedProduct(name, price , date);
				list.add(pro);
			}
			else if(ch == 'i') {
				System.out.println("Custims free:");
				double custom = ler.nextDouble();
				Product pro = new ImportedProduct(name, price, custom);
				list.add(pro);
			}
		}
		System.out.println("PRICE TAGS:");
		for (Product pro : list) {
			System.out.println(pro.priceTag());
		}
		
		
		
		
		
		
		
	}

}
