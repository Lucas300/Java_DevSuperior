package curso_programacao.Heranca_e_Polimorfismo.Veiculo;

class Carro extends Veiculo {
    int numeroDePortas;

    Carro(String marca, int ano, int numeroDePortas) {
        super(marca, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
