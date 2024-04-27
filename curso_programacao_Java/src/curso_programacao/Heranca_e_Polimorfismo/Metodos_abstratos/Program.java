package curso_programacao.Heranca_e_Polimorfismo.Metodos_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes:");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #"+(i+1)+"data:");
			System.out.print("Rectangle or cCircle (r/c)?");
			char ch = ler.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(ler.next());
			if(ch == 'r'){
				System.out.print("Width:");
				double width = ler.nextDouble();
				System.out.println("Height:");
				double height = ler.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.println("Radius:");
				double radius = ler.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(shape.area());
		}
	}

}
