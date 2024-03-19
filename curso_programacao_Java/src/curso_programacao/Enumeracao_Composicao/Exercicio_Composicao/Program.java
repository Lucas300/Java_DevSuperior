package curso_programacao.Enumeracao_Composicao.Exercicio_Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		//formatando a data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name:");
		String departmentName = ler.next();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = ler.nextLine();
		
		System.out.print("Level: ");
		String  workerLevel = ler.nextLine();
		
		System.out.print("Base salary: ");
		double  workerSalary = ler.nextDouble();
		
		//instanciando um Trabalhador          worklevel é um enum    e o departamento é outra classe
		Worker worker =new  Worker(workerName,WorkerLevel.valueOf(workerLevel),workerSalary, new Department(departmentName));
		
		
		System.out.print("How many contracts to this worker? ");
		int n = ler.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.print("Enter contract "+i+"# data: ");
			System.out.print("Date (DD/MM/YYYY)");
			//pode gerar uma exceções
			Date contractdate = sdf.parse(ler.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = ler.nextDouble();
			System.out.print("Duration (Hours): ");
			int hours = ler.nextInt();
			//Instanciando um contrato
			HourContract contract = new HourContract(contractdate, valuePerHour, hours);
			
			//associando o contrato com o trabalhador
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate icome (MM/YYYY): ");
		String monthAndYear = ler.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Departament: "+worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear + " : "+ String.format("%.2f", worker.income(year, month)));
		
		ler.close();
	}
}
