package curso_programacao.Heranca_e_Polimorfismo.Formas_Geometricas;

public class Retangulo  extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);  
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();  
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }
}
