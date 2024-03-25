package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    @SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(ler.next());
        
        Client cli = new Client(name, email, birthDate);
        
        System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(ler.next());

		Order order = new Order(new Date(), status, cli);

		System.out.print("how many items to this order?");
		int n = ler.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #"+(i+1)+" item data: ");
			System.out.print("Product name:");
			ler.nextLine();
			String productName = ler.nextLine();
			System.out.print("Product price:");
			double productPrice = ler.nextDouble();
			System.out.println("Product quantity:");
			int productQuantity = ler.nextInt();

			//intanciando um produto
			Product product = new Product(productName, productPrice);
			//instanciando Item de pedido
			OrderItem it = new OrderItem(productQuantity, productPrice, product);
			//adicionando um item de pedido ao collection
			order.addItem(it);
			
		}
		System.out.println();
		System.out.println(order);

        ler.close();
    }
}
