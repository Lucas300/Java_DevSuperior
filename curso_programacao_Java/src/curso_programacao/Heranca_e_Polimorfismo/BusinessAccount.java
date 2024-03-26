package curso_programacao.Heranca_e_Polimorfismo;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		//caso a Super CLasse tenha uma logica dentro de um construtor padrão dela
		super();
	}
	//na hora de fazer o construtor tem que usar como parametro os dados da Super classe 

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		//só sera feito o emprestimo caso o valor do emprestimo seja maior que o limit de emprestimo que ele pode fazer
		if (amount <= loanLimit) {
			balance += amount - 10;		
		}
	}
	
	
}
