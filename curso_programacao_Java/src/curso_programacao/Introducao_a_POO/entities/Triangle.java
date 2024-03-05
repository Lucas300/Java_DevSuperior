package curso_programacao.Introducao_a_POO.entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	//criando um metodo para calcular a area do triangulo
	public double area() {
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));	
	}
}
