package curso_programacao.Introducao_a_POO;

import java.util.Scanner;

import curso_programacao.Introducao_a_POO.entities.Triangle;

public class ProblemaSemPOO {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 Fazer um programa para ler as medidas dos lados de dois triangulos
		x e y(suponha medidas validas)mostrar o valor das áreas dos dois triângulos
		e dizer qual dos dois triangulos possui a maior area
		*/
		Scanner ler = new Scanner(System.in);
		
		//Objetos dinamicos ficam alocados no Heap
		Triangle x , y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = ler.nextDouble();
		x.b = ler.nextDouble();
		x.c = ler.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = ler.nextDouble();
		y.b = ler.nextDouble();
		y.c = ler.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p *(p - x.a)*(p - x.b)*(p -x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p *(p - y.a)*(p - y.b)*(p -y.c));
		
		System.out.printf("Triangle X area: %.4f %n",areaX);
		System.out.printf("Triangle Y area: %.4f %n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else if(areaY > areaX) {
			System.out.println("Larger area: Y");
		}else {
			System.out.println("X = Y");
		}
	}
}
