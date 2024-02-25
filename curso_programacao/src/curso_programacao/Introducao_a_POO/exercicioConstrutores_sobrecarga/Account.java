package curso_programacao.Introducao_a_POO.exercicioConstrutores_sobrecarga;

public class Account {
	private int number;
	private String name;
	private double saldo;
	
	
	public Account(int number, String name, double saldo) {
		this.number = number;
		this.name = name;
		this.saldo = saldo;
		if(saldo > 0) {
			this.saldo = saldo;
		}else {
			this.saldo = 0.00;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
