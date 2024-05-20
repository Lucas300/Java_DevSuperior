package curso_programacao.Heranca_e_Polimorfismo.Formas_Geometricas;

public class Circulo extends Forma {
    private double raio;


    public Circulo(String cor, double raio) {
        super(cor);  
        this.raio = raio;
    }

  
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

   
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
    }
}
