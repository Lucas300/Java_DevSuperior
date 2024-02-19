package curso_programacao.Introducao_a_POO;

import java.util.Scanner;

public class ProblemaSemPOO {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler as medidas dos lados de dois triangulos
		x e y(suponha medidas validas)mostrar o valor das áreas dos dois triângulos
		e dizer qual dos dois triangulos possui a maior area
		*/
		Scanner ler = new Scanner(System.in);
		double xA,xB,xC, yA,yB,yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = ler.nextDouble();
		xB = ler.nextDouble();
		xC = ler.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = ler.nextDouble();
		yB = ler.nextDouble();
		yC = ler.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p *(p - xA)*(p - xB)*(p -xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p *(p - yA)*(p - yB)*(p -yC));
		
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
