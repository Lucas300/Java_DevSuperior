package curso_programacao.Heranca_e_Polimorfismo.Veiculo;

class Motocicleta extends Veiculo {
    boolean temSidecar;
    
    Motocicleta(String marca, int ano, boolean temSidecar) {
        super(marca, ano);
        this.temSidecar = temSidecar;
    }

    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
