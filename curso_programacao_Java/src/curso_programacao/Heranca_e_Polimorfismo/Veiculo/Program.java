package curso_programacao.Heranca_e_Polimorfismo.Veiculo;

public class Program {

	public static void main(String[] args) {
		
        Carro meuCarro = new Carro("Toyota", 2021, 4);

        Motocicleta minhaMoto = new Motocicleta("Harley-Davidson", 2020, false);

        System.out.println("Detalhes do Carro:");
        meuCarro.exibirDetalhes();

        System.out.println("\nDetalhes da Motocicleta:");
        minhaMoto.exibirDetalhes();

	}

}
