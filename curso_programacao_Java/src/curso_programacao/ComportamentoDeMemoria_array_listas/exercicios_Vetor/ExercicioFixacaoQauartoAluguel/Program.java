package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.ExercicioFixacaoQauartoAluguel;

import java.util.Scanner;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("how many rooms woll be rented? ");
		int n = ler.nextInt();
		
		Rent vect[] = new Rent[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #"+(i+1)+":");
			System.out.print("name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Email:");
			String email =  ler.nextLine();
			System.out.print("Room: ");
			int roomNumber = ler.nextInt();
			
			vect[roomNumber] = new Rent(name,email);
		}
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i+": "+vect[i]);
			}
		}
		
		ler.close();
	}

}
