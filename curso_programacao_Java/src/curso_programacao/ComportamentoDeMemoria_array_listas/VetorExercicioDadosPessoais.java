package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorExercicioDadosPessoais {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.print("Quantas pessoas serao digitadas? ");
			int n = ler.nextInt();
			
			String nome[] = new String[n],genero;
			float altura[] = new float[n],soma_altura=0,maior_altura,menor_altura;
			int m = 0,f = 0;
			
			for(int contador = 0;contador<n;contador++) {
				System.out.print("Altura da "+(contador+1)+"º pessoa");
				altura[contador] = ler.nextFloat();
				System.out.print("Genero da "+(contador+1)+"º pessoa");
				genero = ler.next();
				switch(genero) {
					case "f":
						f = f+1;
						soma_altura = soma_altura+altura[contador];
					break;
					case "m":
						m = m+1;
					break;
				}
			}
			maior_altura = altura[0];
			for(int contador = 0;contador<n;contador++) {
				if(altura[contador] >= maior_altura ) {
					maior_altura = altura[contador];
				}
			}
			menor_altura = altura[0];
			for(int contador = 0;contador<n;contador++) {
				if(altura[contador] <= menor_altura ) {
					menor_altura = altura[contador];
				}
			}
			System.out.println("Menor altura = "+menor_altura);
			System.out.println("Maior altura = "+maior_altura);
			System.out.println("Media das alturas das mulheres = "+df.format(soma_altura/f));
			System.out.println("Numero de homens = "+m);
		}

	}


