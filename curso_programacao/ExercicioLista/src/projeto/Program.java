package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("How many employee will be registered?");
		int n = ler.nextInt();
		int id, x = 0,porcentagem = 0;
		boolean igual = false,funcionarioExiste = false;
		String nome;
		double salario;
		
		List<Funcionarios> lista = new ArrayList<Funcionarios>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee: #"+(i+1)+":");
			System.out.print("id: ");
			id = ler.nextInt();
			do {
				for (Funcionarios funcionarios : lista) {
					if (funcionarios.getId() == id) {
						igual = true;
					}else {
						igual = false;
					}
				}
				if (igual) {
					System.out.print("Id existente, Digite outro:");
					id = ler.nextInt();
				}
				//verificando se o id é igual a um ja existente se for ele pedira pra digitar novamente
			}while(igual);
			System.out.print("Name:");
			nome = ler.next();
			System.out.print("Salary:");
			salario = ler.nextDouble();
						
			lista.add(new Funcionarios(id,nome,salario));			
						
		}
		System.out.println();
		//Porcentagem do aumento
		System.out.print("Enter the employee id that will salary increase:");
		int idFuncionario = ler.nextInt();
		
		//
		for (Funcionarios funcionarios : lista) {
			if (funcionarios.getId() == idFuncionario) {
				System.out.print("Enter the percentage");
				porcentagem = ler.nextInt();
				funcionarioExiste = true;
				funcionarios.porcentagemAumento(porcentagem);
			}				
		}
		
		if (funcionarioExiste == false) {
			System.out.println("This id does not exist!");			
		}	
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionarios funcionarios : lista) {
			System.out.println(funcionarios);
		}

		ler.close();
	}

}
