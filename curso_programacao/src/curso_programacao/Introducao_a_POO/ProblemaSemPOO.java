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
		
		
		double areaX = x.area();
				
		double areaY = y.area();
		
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
