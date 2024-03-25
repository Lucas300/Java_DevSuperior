package curso_programacao.Enumeracao_Composicao.Exercicio_Final_OrdemPedido;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birthDate;

	
	public Client() {
		
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}
 	
	
	/*
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: ")
		.append(getName())
		.append(", (")
		.append(sdf.format(birthDate))
		.append(") - ")
		.append(getEmail());
		
		return sb.toString();
	}
	*/
}