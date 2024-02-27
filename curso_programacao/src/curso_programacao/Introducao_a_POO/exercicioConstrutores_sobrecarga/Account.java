package curso_programacao.Introducao_a_POO.exercicioConstrutores_sobrecarga;

public class Account {
	private int number;
	private String name;
	private double saldo;
	
	
	public Account(int number, String name, double depositoInicial) {
		this.number = number;
		this.name = name;
		//encapsulando o metodo depositar
		depositar(depositoInicial);
	}
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public double depositar(double number) {
		return this.saldo += number;
	}
	public double sacar(double number) {
		return this.saldo = this.saldo - number-5;
	}
	public String toString() {
		return String.format("Account %d Holder:%s, Balance: $%.2f",getNumber(),getName(),getSaldo());
	}
	
	
	
	//alterar nome 
	//não alterar numero da conta
	//ter metodos de saques(taxa de saque R$:5,00) e depositos
	
}
