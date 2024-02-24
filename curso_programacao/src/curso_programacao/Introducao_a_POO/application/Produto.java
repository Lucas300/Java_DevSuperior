package curso_programacao.Introducao_a_POO.application;

public class Produto {
	public String name;
	public double price;
	public int quantity;
	
	//podemos criar um construtor para que o programa não deixe salvar sem dados
	public Produto(String name, double price, int quantity){
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public double totalValueInStock() {
		double total = price * quantity;
		return total;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity; 
	}
	
	public String toString() {
		return "Product data: "+ name + ", $"+String.format("%.2f", price)+", " +quantity+" units"+" total $"+String.format("%.2f", totalValueInStock());
	}

}
