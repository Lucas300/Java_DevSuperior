package curso_programacao.Desafios;

import java.util.LinkedList;

public class LinkedList_test {
    public static void main(String[] args) {
        // Criação da LinkedList
        LinkedList<String> nomes = new LinkedList<>();

        // Adicionando elementos à lista
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Diana");

        // Exibindo a lista 
        System.out.println("Lista de nomes: " + nomes);

        // Removendo o nome da  lista no (índice 0)
        nomes.remove(0);

        // Exibindo a lista novamente pos remoção
        System.out.println("Lista após remoção: " + nomes);

        // Adicionando um nome no início da lista
        nomes.addFirst("Eva");

        // Exibindo a lista novamente
        System.out.println("Lista após adicionar no início: " + nomes);
    }
}
