package curso_programacao.Heranca_e_Polimorfismo.Exercicio_resolvido;

public class OutsourcedEmplooyee extends Employee{
	private Double additionalCharge;

	public OutsourcedEmplooyee() {
		super();
	}

	public OutsourcedEmplooyee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	 
}
