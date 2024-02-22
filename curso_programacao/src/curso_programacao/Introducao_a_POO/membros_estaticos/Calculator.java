package curso_programacao.Introducao_a_POO.membros_estaticos;

public class Calculator {

	
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return (double)(2.0 * PI * radius);
	}

	public double volume(double radius) {
		return (double)(4.0 * PI * radius * radius * radius / 3.0);
	}
}
