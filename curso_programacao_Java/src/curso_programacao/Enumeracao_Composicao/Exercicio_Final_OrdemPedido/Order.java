package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	List<OrderItem> orderitem = new ArrayList<OrderItem>();
	
	public Order() {	
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderitem() {
		return orderitem;
	}

	public void addItem(OrderItem item) {
		orderitem.add(item);
	}
	public void removeItem(OrderItem item) {
		orderitem.remove(item);
	}
	public Double total() {
		Double total = 0.0;
		for (OrderItem orderItem2 : orderitem) {
			total = total + orderItem2.subTotal();
		}
		return total;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : orderitem) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
	
	

}
