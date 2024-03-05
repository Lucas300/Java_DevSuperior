package curso_programacao.Introducao_a_POO.exercicios.classes;

public class Aluno {
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaFinal() {		
		var mediaNotas = (nota1 + nota2 + nota3);
		return mediaNotas;
	}

	public String verificarNota() {
		var falta = 60 - notaFinal();  
		if (notaFinal() < 60) {
			return String.format("FINAL GRADE = %.2f %nFAILED %nMISSING = %.2f ", notaFinal(),falta);
		}else {
			return String.format("FINAL GRADE = %.2f %nPASS", notaFinal());
		}
	}
}
