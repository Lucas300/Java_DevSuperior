package curso_programacao.Heranca_e_Polimorfismo;

//A classe abstrata não pode ser instanciada, somente as subclasses
public abstract class Account {
	private Integer number;
	private String holder;
	//usei o protected para reusar esse atributo dentro de um metodo da subclasse
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance = balance - amount - 5;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
}
