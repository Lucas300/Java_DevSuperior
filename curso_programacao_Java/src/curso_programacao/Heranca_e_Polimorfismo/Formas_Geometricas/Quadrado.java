package curso_programacao.Heranca_e_Polimorfismo.Formas_Geometricas;

public class Quadrado extends Retangulo {
	
    public Quadrado(String cor, double lado) {
        super(cor, lado, lado);  
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cor: " + getCor());
        System.out.println("Lado: " + getLargura());
        System.out.println("Área: " + calcularArea());
    }
}