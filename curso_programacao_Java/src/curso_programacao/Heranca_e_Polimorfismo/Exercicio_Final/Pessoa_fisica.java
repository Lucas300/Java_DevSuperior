package curso_programacao.Heranca_e_Polimorfismo.Exercicio_Final;

public class Pessoa_fisica extends Contribuentes {
	private Double saude;
	
	public Pessoa_fisica() {
		super();
	}

	public Pessoa_fisica(String nome, Double renda_anual, Double saude) {
		super(nome, renda_anual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public double taxa(){
		if(super.getRenda_anual()<20000.00) {
			return (super.getRenda_anual()*0.15)-(this.saude*0.5);
		}else {
			return (super.getRenda_anual()*0.25)-(this.saude*0.5);
		}
	}
}
