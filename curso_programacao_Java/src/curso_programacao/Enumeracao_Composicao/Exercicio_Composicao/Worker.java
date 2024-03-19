package curso_programacao.Enumeracao_Composicao.Exercicio_Composicao;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//O trabalhador pertence a um departamento apenas 
	private Department department;
	
	//Um funcionario pode ter varios contratos
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	
}
