package curso_programacao.ComportamentoDeMemoria_array_listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<String>(); //não aceita tipos primitivos
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");//entrou na lista sem prejudicar a lista
		
		System.out.println(list.size());
		
//		list.remove("Anna"); // remove por comparação
//		list.remove(1); //remove por posição
		
		for(String x:list) {
			System.out.println(x);
		}
		
		System.out.println("-----Nova lista-------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos que começam com a letra M
		
		for(String x:list) {
			System.out.println(x);
		}
		
		System.out.println("-----Econtrar a posição de um elemento da lista------");
		System.out.println("Index of Bob:"+list.indexOf("Bob"));
		System.out.println("Index of Bob:"+list.indexOf("Marco"));//Quando o indexOf não achar ele retornara -1
		
		
		System.out.println("------Pegar os elementos que começam com a letra A----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();//fazendo uma lista 
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------Encotrar o primeiro elemento que começa com A----- ");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);//caso não tenha um elemento que comece com a ele retornara null
		System.out.println(name);
	}

}
