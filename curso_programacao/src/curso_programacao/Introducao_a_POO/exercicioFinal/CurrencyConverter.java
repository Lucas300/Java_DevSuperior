package curso_programacao.Introducao_a_POO.exercicioFinal;

public class CurrencyConverter {
	double dollar;
	double quantidade;

	public static double conversion(double dollar,double quantidade) {
		return 1.06*(dollar * quantidade);
	}

}
