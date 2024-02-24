package curso_programacao.Introducao_a_POO.application;

public class Produto {
	private String name;
	private double price;
	private int quantity;

	// podemos criar um construtor para que o programa não deixe salvar sem dados
	public Produto() {
	}

	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		double total = price * quantity;
		return total;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}

//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	public int getQuantity() {
		return this.quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Product data: " + this.name + ", $" + String.format("%.2f", this.price) + ", " + this.quantity + " units" + " total $"
				+ String.format("%.2f", totalValueInStock());
	}

}
