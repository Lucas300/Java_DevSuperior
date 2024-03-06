package curso_programacao.ComportamentoDeMemoria_array_listas.exercicio_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("How many employees will be registered: ");
		int n = ler.nextInt();
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Emplloyee: "+(i+1));
			System.out.print("ID: ");
			int id = ler.nextInt();
			System.out.print("Name: ");
			String nome = ler.next();
			System.out.print("Salary: ");
			double salario = ler.nextDouble();		
			listaFuncionario.add(new Funcionario(id,nome,salario));
			System.out.println();
		}
		
		System.out.print("Enter the emloyee id that will have salary increase: ");
		int id = ler.nextInt();
		boolean usuarioEncontrado = false;
		
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getId() == id) {
				System.out.print("Enter the percentage:");
				int porcentagem = ler.nextInt();
				funcionario.aumentoPorPorcentagem(porcentagem);
				usuarioEncontrado = true;
			}
		}
		if (!usuarioEncontrado) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario funcionario : listaFuncionario) {
			
			System.out.println(funcionario);
		}
		//System.out.println(func1);
		
		
		ler.close();
	}

}
