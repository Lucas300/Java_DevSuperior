package curso_programacao.ComportamentoDeMemoria_array_listas.exercicios_Vetor.Exercicio11_DadosPessoas;

import java.util.Scanner;

public class Dados_Alturas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas?");
		int n = ler.nextInt();
		char sexo;
		int contadorMulheres = 0, contadorhomens = 0;
		double altura, maiorAltura = 0, menorAltura = 1000000000.00, mediamulheres = 0;
		double totalAlturaMulheres = 0;
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %dº pessoa:", i + 1);
			altura = ler.nextDouble();
			System.out.printf("Genero da %dº pessoa:", i + 1);
			sexo = ler.next().charAt(0);
			pessoa[i] = new Pessoa(sexo, altura);
			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			} else if (pessoa[i].getAltura() < menorAltura ) {
				menorAltura = pessoa[i].getAltura();
			}
			if (sexo == 'f') {
				contadorMulheres += 1;
				totalAlturaMulheres += pessoa[i].getAltura();
			} else {
				contadorhomens += 1;
			}
		}
		mediamulheres = totalAlturaMulheres / contadorMulheres;
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediamulheres);
		System.out.println("Quantidade de Homens = " + contadorhomens);

		ler.close();
	}

}
