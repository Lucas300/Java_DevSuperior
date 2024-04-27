package curso_programacao.Heranca_e_Polimorfismo.Exercicio_Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<Contribuentes> list = new ArrayList<>();
		double total = 0;
		
		System.out.print("Enter the number of tax payers:");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do Contribuidor "+(i+1)+"º");
			System.out.print("Pessoa física ou jurídica(f/j)");
			char opc = ler.next().charAt(0);
			System.out.print("Name: ");
			String name = ler.next();
			System.out.print("Salario Anual: ");
			double salario_anual = ler.nextDouble();
			if(opc == 'f') {
				System.out.print("Gastos com Saúde:");
				double saude = ler.nextDouble();
				list.add(new Pessoa_fisica(name,salario_anual,saude));
			}else {
				System.out.print("Quantos funcionários?:");
				int funcionarios = ler.nextInt();
				list.add(new Pessoa_juridica(name,salario_anual,funcionarios));
			}
		}
		System.out.println();
		System.out.println("Taxes paid:");
		for (Contribuentes co : list) {
			System.out.printf("%S: $ %.2f\n",co.getNome(),co.taxa());
			total= total+co.taxa();
		}
		
		System.out.printf("TAXA TOTAL: $ %.2f ",total);

	}

}
