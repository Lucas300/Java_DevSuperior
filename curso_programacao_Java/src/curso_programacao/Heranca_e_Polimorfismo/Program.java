package curso_programacao.Heranca_e_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		
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
		Account acc7 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
	
		Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);
		acc8.withdraw(200);
		System.out.println(acc8.getBalance());
		
		//polimosfismo , fazendo um obejto do mesmo tipo , mas com comportamentos exclusivos da classe especifica
		Account y = new SavingsAccount(1023, "maria", 1000.0, 0.01);
		

		y.withdraw(50.0);
		
	
		System.out.println(y.getBalance());
		
		//Account é uma classe abstrata e não se pode instanciar, mas as subclasses podem ser instanciadas  
		 
		Account acc13 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		Account acc14 = new BusinessAccount(1003,"Lucas",1000.0,500.0);
		
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1004,"Marta",500.0,0.01));
		list.add(new BusinessAccount(1005,"Diogo",600.0,400.0));
		list.add(new SavingsAccount(1006,"Bob",300.0,0.01));
		list.add(new BusinessAccount(1007,"Anna",500.0,500.0));
	
		//Obtendo o total do soaldo de todas as contas 
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}	
		System.out.printf("Total balance: %.2f%n",sum);
		//Adicionando 10 ao saldo de cada conta
		for(Account acc:list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());			
		}
		
	}

}
