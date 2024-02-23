package curso_programacao.Introducao_a_POO.membros_estaticos;

import java.util.Scanner;

public class Membros_Estaticos {
	//constante
	public static final double PI = 3.14159;
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = ler.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circuference: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI value: %.2f %n", Calculator.PI);

		ler.close();
	}

	
}
