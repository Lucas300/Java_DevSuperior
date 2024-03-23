package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	
	List<OrderItem> orderitem = new ArrayList<OrderItem>();
	
	public Order() {	
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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
		sb.append("ORDER SUMMARY: \n")
		.append("Order moment: ")
		.append(sdf.format(getMoment()))
		.append("\n")
		.append("Order Status: ")
		.append(getStatus())
		.append("\n");
		
		return sb.toString();
	}
	
	
	
	
	
	
	

}
