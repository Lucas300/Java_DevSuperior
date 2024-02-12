package curso_programacao.estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio06_CalculosGeometricos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		triangulo = a * c / 2.0;
		circulo = 3.14159 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("Triangulo = %.3f %n",triangulo);
		System.out.printf("Circulo = %.3f %n",circulo);
		System.out.printf("Trapezio = %.3f %n",trapezio);
		System.out.printf("Quadrado = %.3f %n",quadrado);
		System.out.printf("Retangulo = %.3f %n",retangulo);
		
		
		entrada.close();

	}

}
