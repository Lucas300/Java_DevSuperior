package curso_programacao.Enumeracao_Composicao.Exercicio_Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//O trabalhador pertence a um departamento apenas 
	private Department department;
	
	//Um funcionario pode ter varios contratos           IMPORTANTE: NÃO USAOS LISTAS NO CONSTRUTOR
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	//Adicionando contratos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	//Removendo contratos
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//implementação do metodo que terona a soma do salario mais a soma do contrato de um determinado mes, usando o calendar
	public double income(int year,int month) {
		double sum = baseSalary;
		//usando o calendar para receber os valores da data dos contratos feito pelo usuario
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
		    int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	
	
}
