package curso_programacao.estrutura_repetitiva.exercicios_While;

import java.util.Scanner;

public class Exercicio03_Posto_de_Combustivel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int alc =0, gas = 0, die =0 ,n =0 ;
		System.out.println("1-Álcool");
		System.out.println("2-Gasolina");
		System.out.println("3-Diesel");
		System.out.println("4-Sair");
		
		while (n != 4){
			n = ler.nextInt();
			switch(n) {
				case 1:
					alc += 1;
				break;
				case 2:
					gas += 1;
				break;
				case 3:
					die += 1;
				break;
				default:
					
				break;
			}
		} 
		System.out.println("Álcool :"+alc);
		System.out.println("Gasolina :"+gas);
		System.out.println("Diesel :"+die);
		ler.close();
	}

}
