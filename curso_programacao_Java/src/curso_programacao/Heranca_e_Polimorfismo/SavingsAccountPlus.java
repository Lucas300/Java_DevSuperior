package curso_programacao.Heranca_e_Polimorfismo;

//quando usamos o final na classe , impedimos que ela tenha classes herdeiras
public class SavingsAccountPlus  extends SavingsAccount{
	
	//quando usamos o final no metodo impedimos que outras classes usem o override em seus metodos
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}	
