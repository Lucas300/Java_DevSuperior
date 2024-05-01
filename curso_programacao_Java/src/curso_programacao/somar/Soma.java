package curso_programacao.somar;

public class Soma {
	private int n1;
	private int n2;
	
	//metodo construtor
	public Soma(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public Soma() {
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	//Metodo Somar   VOID 
	public int Somar(){	 
		return this.n1+this.n2;
	}
	
	
}//fechando a classe
