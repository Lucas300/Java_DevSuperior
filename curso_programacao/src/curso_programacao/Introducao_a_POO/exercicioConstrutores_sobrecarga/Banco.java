package curso_programacao.Introducao_a_POO.exercicioConstrutores_sobrecarga;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double entry;
		System.out.print("Enter account number:");
		int number = ler.nextInt();

		System.out.print("Enter account holder:");
		String name = ler.next();

		System.out.print("Is there na initial value(y/n):");
		String s = ler.next();

		Account account;
		
		if (s.equals("y")) {
			System.out.print("Enter initial deposit value:");
			entry = ler.nextDouble();
			account = new Account(number, name, entry);
		} else {
			entry = 0.00;
			account = new Account(number, name);
		}

		
		System.out.println("Account data:");

		System.out.println(account);
		System.out.println();

		System.out.print("Enter deposit value:");
		entry = ler.nextDouble();
		account.depositar(entry);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter withdraw value:");
		double exit = ler.nextDouble();
		account.sacar(exit);
		System.out.println("Updated account data:");
		System.out.println(account);

		ler.close();
	}

}
