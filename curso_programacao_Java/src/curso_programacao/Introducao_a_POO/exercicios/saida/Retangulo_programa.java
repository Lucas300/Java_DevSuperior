package curso_programacao.Introducao_a_POO.exercicios.saida;

import java.util.Scanner;

import curso_programacao.Introducao_a_POO.exercicios.classes.Retangulo;

public class Retangulo_programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.altura = ler.nextDouble();
		retangulo.largura = ler.nextDouble();
		
		
		System.out.println("AREA: "+retangulo.area());
		System.out.println("PERIMETER: "+retangulo.perimetro());	
		System.out.println("DIAGONAL: "+retangulo.diagonal());
		
		ler.close();
	}

}
