package curso_programacao.Introducao_a_POO.application;

public class Produto {
	public String name;
	public double price;
	public int quantity;
	
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
	

}
