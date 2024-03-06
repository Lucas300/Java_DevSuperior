package curso_programacao.ComportamentoDeMemoria_array_listas.exercicio_Listas;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome,double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	
	public double aumentoPorPorcentagem(double porcentagem){
		this.salario = this.salario * (1 + (porcentagem/100));
        return this.salario;
	}
	
	
	public String toString() {
		return getId()+","+getNome()+","+getSalario();
	}
}
