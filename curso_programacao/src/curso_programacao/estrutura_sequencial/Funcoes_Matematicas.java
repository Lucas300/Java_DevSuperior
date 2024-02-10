package curso_programacao.estrutura_sequencial;

public class Funcoes_Matematicas {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = 5.0;
		double a,b,c;

		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de "+x+" = "+ a);
		System.out.println("Raiz quadrada de "+y+" = "+ b);
		System.out.println("Raiz quadrada de "+z+" = "+ c);
		
		a = Math.pow(x,y);
		b = Math.pow(x,2.0);
		c = Math.pow(5.0,2.0);
		System.out.println(x + "elevado a "+x+" = "+ a);
		System.out.println(x + "elevado ao quadrado "+y+" = "+ b);
		System.out.println("5 elevado ao quadrado = "+ c);
		System.out.println();
		
		a = Math.abs(x);
		b = Math.abs(z);
		System.out.println("Valor absoluto de "+x+" = "+ a);
		System.out.println("Valor absoluto de " +z+" = "+ b);
	
	}

}
