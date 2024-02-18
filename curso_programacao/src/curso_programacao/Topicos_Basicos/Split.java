package curso_programacao.Topicos_Basicos;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s = "potato apple lemon orange";
		/*podemos usar o split para separar cada 
		palavra de uma String em um vetor*/
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		ler.close();
	}

}
