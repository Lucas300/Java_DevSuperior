package curso_programacao.Introducao_a_POO.exercicios.classes;

public class Funcionario {
	public String name;
	public double salary;
	public double tax;
	
	public double NetSalary() {
		return salary - tax;
	}
	public void IncreaseSalary(double porcentage) {
		 salary += salary*(porcentage/100);
	}
	
	public String toString() {
		return String.format("%s, $%.2f", name,NetSalary());
	}
}
