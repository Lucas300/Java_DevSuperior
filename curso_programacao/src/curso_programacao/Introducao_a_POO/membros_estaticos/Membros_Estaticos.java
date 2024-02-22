package curso_programacao.Introducao_a_POO.membros_estaticos;

import java.util.Scanner;

public class Membros_Estaticos {
	//constante
	public static final double PI = 3.14159;
	
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = ler.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circuference: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI value: %.2f %n", PI);

		ler.close();
	}

	public static double circumference(double radius) {
		return (double)(2.0 * PI * radius);
	}

	public static double volume(double radius) {
		return (double)(4.0 * PI * radius * radius * radius / 3.0);
	}
}
