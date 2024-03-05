package curso_programacao.Topicos_Basicos;

import java.util.Scanner;

public class Operadores_bitwise {

	public static void main(String[] args) {
		//Oberadores bitwise
		//utilizado em programação de baixo nivel para comparar bits
		Scanner ler = new Scanner(System.in);
		int mask = 0b100000;
		int n = ler.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		
		ler.close();
	}

}
