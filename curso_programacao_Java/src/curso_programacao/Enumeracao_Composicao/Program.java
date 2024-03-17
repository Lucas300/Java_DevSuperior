package curso_programacao.Enumeracao_Composicao;

import java.util.Date;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Order order1 = new Order(1080,new Date(),OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order1);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
	
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		Order order2 = new Order(1080,new Date(),os1);
		System.out.println(order2);
		
		

	}

}
