package curso_programacao.Heranca_e_Polimorfismo.Formas_Geometricas;

public class Forma {

    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

 
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   
    public double calcularArea() {
        return 0;
    }

    public void exibirInfo() {
        System.out.println("Cor: " + cor);
    }
}
