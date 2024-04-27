package curso_programacao.Heranca_e_Polimorfismo.Metodos_abstratos;

import java.awt.Color;

public abstract class Shape {
	private Color color;

	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Shape() {
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
