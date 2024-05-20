package curso_programacao.Heranca_e_Polimorfismo.Formas_Geometricas;

public class Program {
	    public static void main(String[] args) {
	        // Cria um objeto Circulo
	        Circulo circulo = new Circulo("Vermelho", 5.0);
	        circulo.exibirInfo();

	        // Cria um objeto Retangulo
	        Retangulo retangulo = new Retangulo("Azul", 4.0, 6.0);
	        retangulo.exibirInfo();

	        // Cria um objeto Quadrado
	        Quadrado quadrado = new Quadrado("Verde", 3.0);
	        quadrado.exibirInfo();
	        
	        System.out.println("Ola");
	    
	}
}
