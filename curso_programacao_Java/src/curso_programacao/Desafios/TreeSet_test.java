package curso_programacao.Desafios;

import java.util.TreeSet;

public class TreeSet_test {
    public static void main(String[] args) {
        // Criação do TreeSet
        TreeSet<String> nomes = new TreeSet<>();

        // Adicionando elementos ao TreeSet
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Diana");

        // Exibindo o TreeSet (ordem natural)
        System.out.println("TreeSet ordenado: " + nomes);

        // Tentando adicionar um elemento duplicado
        boolean adicionado = nomes.add("Ana");
        System.out.println("Elemento 'Ana' adicionado novamente? " + adicionado);

        // Exibindo o primeiro e o último elemento
        System.out.println("Primeiro elemento: " + nomes.first());
        System.out.println("Último elemento: " + nomes.last());

        // Removendo um elemento do TreeSet
        nomes.remove("Carlos");

        // Exibindo o TreeSet após a remoção
        System.out.println("TreeSet após remoção: " + nomes);
    }
}

