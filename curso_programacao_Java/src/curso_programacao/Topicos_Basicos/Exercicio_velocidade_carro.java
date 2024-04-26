package curso_programacao.Topicos_Basicos;

import java.util.Scanner;

public class Exercicio_velocidade_carro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String carro;
		int velocidade;
		
		//mensagem 
		System.out.print("Digite o modelo do seu carro:");
		//entrada de dados
		carro = ler.next();
		
		
		System.out.print("KM por hora atual: ");
		velocidade = ler.nextInt();
		
		// mesma coisa que (carro == "fiat")
		if (carro.equals("fiat")) {
			if (velocidade <= 30) {
				System.out.println("Velocidade estavel");
			}
			else if(velocidade >30 && velocidade <140) {
				System.out.println("Veiculo em aceleração");
			}
			else if(velocidade == 140) {
				System.out.println("O carro esta em giro maximo");
			}
		}
		else if(carro.equals("honda")) {
			if (velocidade <= 60) {
				System.out.println("Velocidade estavel");
			}
			else if(velocidade >60 && velocidade <120) {
				System.out.println("Veiculo em aceleração");
			}
			else if(velocidade == 170) {
				System.out.println("O Motor esta em giro maximo");
			}
			else if(velocidade > 170) {
				System.out.println("Estado crítico");
			}
		}else {
			System.out.println("Modelo não encontrado");
		}
		
	}

}
