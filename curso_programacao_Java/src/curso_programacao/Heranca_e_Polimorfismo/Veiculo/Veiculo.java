package curso_programacao.Heranca_e_Polimorfismo.Veiculo;

class Veiculo {
    String marca;
    int ano;

    Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
}