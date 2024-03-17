package curso_programacao.Topicos_Especiais_Data_Hora;

import java.util.Scanner;

public class Gustavo_java {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int fibonatcci = 0;
		
		for (int i = 0; i < n; i++) {
			fibonatcci +=i;
			System.out.println(fibonatcci);
		}
		ler.close();
	}
}
