package curso_programacao.Introducao_a_POO.application;

import java.util.Date;

//pedido
public class Order {
	//uma classe pode acessar atributos de outras se os atributos estiverem no mesmo pacote
	//no protected Subclasses podem acessar atributos e metodos
	//no private somente a propria classe pode acessar 
	
	private Date date;
	private Produto product;

	public Order(Date date, Produto product) {
		super();
		this.date = date;
		this.product.name = "tv";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Produto getProduct() {
		return product;
	}

	public void setProduct(Produto product) {
		this.product = product;
	}

}
