package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	List<Product> products = new ArrayList<Product>();

	public OrderItem() {
		
	}


	public OrderItem(Integer quantity, Double price, Product product) {
	
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}





	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	

	public Double subTotal() {
		Double total = 0.0;
		for (Product product : products) {
			total = total + product.getPrice();
		}
	return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Product product : products) {
			sb.append(product.getName())
			.append(", $")
			.append(product.getPrice())
			.append(", ")
			.append(getQuantity())
			.append(", ")
			.append(" Subtotal:")
			.append(subTotal())
			.append("\n");	
		}
		
		return sb.toString();
		
	}
	
	
	
}
