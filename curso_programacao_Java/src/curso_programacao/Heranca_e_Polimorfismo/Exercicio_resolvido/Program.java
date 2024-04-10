package curso_programacao.Heranca_e_Polimorfismo.Exercicio_resolvido;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//intanciando a lista do tipo employee
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+(i+1)+" data:");
			System.out.print("Outsourced (y/n):");	
			char ch = ler.next().charAt(0);
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Hours:");
			int hours = ler.nextInt();
			System.out.print("Value per Hour:");
			double valuePerFour = ler.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional Charge:");
				double additionalCharge = ler.nextDouble();
				Employee emp = new OutsourcedEmplooyee(name, hours, valuePerFour, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerFour);
				list.add(emp);
			}
	
		}
		System.out.println();
		System.out.println("Payments: ");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
		}	
		
	}

}
