package curso_programacao.estrutura_condicional;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		// variavel = (condição)? retorno_caso_true : retorno_false; 
		desconto = (preco < 20)? preco * 0.1 : preco * 0.05;
		
		//mesma coisa que
		if(preco < 20) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.5;
		}
		System.out.println(desconto);
	}
	
	

}
