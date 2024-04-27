package curso_programacao.Heranca_e_Polimorfismo.Exercicio_Final;

public class Pessoa_juridica extends Contribuentes{
	private int num_funcionarios;

	public Pessoa_juridica() {
		super();
	}
	
	public Pessoa_juridica(String nome, Double renda_anual, int num_funcionarios) {
		super(nome, renda_anual);
		this.num_funcionarios = num_funcionarios;
	}

	public int getNum_funcionarios() {
		return num_funcionarios;
	}

	public void setNum_funcionarios(int num_funcionarios) {
		this.num_funcionarios = num_funcionarios;
	}
	
	@Override
	public double taxa(){
		if(getNum_funcionarios()>10) {
			return super.getRenda_anual()*0.14;
		}else {
			return super.getRenda_anual()*0.16;
		}
	}
	
	
	
}
