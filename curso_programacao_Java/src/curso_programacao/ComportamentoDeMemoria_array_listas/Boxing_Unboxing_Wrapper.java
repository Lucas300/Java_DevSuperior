package curso_programacao.ComportamentoDeMemoria_array_listas;

public class Boxing_Unboxing_Wrapper{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Boxing
		//É o processo de conversão de um objeto tipo valor para um objeto tipo referência compativel
		int x = 20;
		Object obj = x;
		
		//unboxing
		//É o processo de convsão de um objeto tipo referência para um objeto tipo valor compatível
		int y = (int) obj; // recebendo o valor em uma variavel 
		
		//Wrappers classes 
		//são classes equivalentes aos tipos primitivos 
		//usamos para fazer boxing e unboxing
		
		Integer obj2 = x ; //não precisa fazer o casting
		//usufruem dos recursos do POO
		
		
		}
	}