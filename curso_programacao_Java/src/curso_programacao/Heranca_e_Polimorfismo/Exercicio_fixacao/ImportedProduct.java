package curso_programacao.Heranca_e_Polimorfismo.Exercicio_fixacao;

public class ImportedProduct extends Product{
	private Double customsFree;

	public ImportedProduct(Double customsFree) {
		super();
		this.customsFree = customsFree;
	}

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	public String priceTag() {
		return super.getName() +String.format( "$ %.2f ", totalPrice())+"(Customs free: $"+ super.getPrice()+")";
	}
	
	public double totalPrice() {
		return super.getPrice()+customsFree;
	}
	
}
