package curso_programacao.Heranca_e_Polimorfismo;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Account acc = new Account(1001,"alex",0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0,500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//vai dar um erro porque  o acc3 é SavingsAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		//verificando se é instancia
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 =(SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
		//teste com o override
		Account acc6 = new Account(1001,"ALEX", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
	
		Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);
		acc8.withdraw(200);
		System.out.println(acc8.getBalance());
		
		//polimosfismo , fazendo um obejto do mesmo tipo , mas com comportamentos exclusivos da classe especifica
		Account x = new Account(1020, "alex", 1000.0);
		Account y = new SavingsAccount(1023, "maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
