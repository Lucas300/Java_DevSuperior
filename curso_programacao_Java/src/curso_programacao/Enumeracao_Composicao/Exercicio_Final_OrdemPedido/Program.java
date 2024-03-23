package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(ler.next());
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(ler.next());

		Client client = new Client(name, email,birthDate);
		Order order = new Order(new Date(), status, client);
		
		
		
		System.out.print("how many items to this order?");
		int n = ler.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #"+(n+1)+"º item data:");
			System.out.print("Product name:");
			String name_product = ler.next();
			System.out.print("Product Price:");
			double price = ler.nextDouble();
			System.out.print("Quantity:");
			int quantity = ler.nextInt();
			
			Product product = new Product(name_product,price);
			OrderItem it = new OrderItem(quantity, price, product);
			
		}
		System.out.println(client);
		System.out.println(order);
		
		
		
		
		
		
		
		

	}

}
