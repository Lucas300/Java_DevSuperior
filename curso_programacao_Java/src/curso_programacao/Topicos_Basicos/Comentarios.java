package curso_programacao.Topicos_Basicos;

import java.util.Scanner;

	/*
		Este programa calcula as raízes de uma equação do segundo grau
		Os valores dos coeficientes devem ser digitados um por linha
 	*/
public class Comentarios {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c; // Cálculo do valor de delta
		
		System.out.println(delta);

	}
}