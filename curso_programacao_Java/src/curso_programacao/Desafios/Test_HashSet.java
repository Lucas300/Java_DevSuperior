package curso_programacao.Desafios;

import java.util.HashSet;

public class Test_HashSet {
    public static void main(String[] args) {
        // Criação do HashSet
        HashSet<String> frutas = new HashSet<>();

        // Adicionando elementos ao HashSet
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");

        // Exibindo o HashSet
        System.out.println("Frutas no HashSet: " + frutas);

        // Tentando adicionar um elemento duplicado
        boolean adicionado = frutas.add("Maçã");
        System.out.println("Elemento 'Maçã' adicionado novamente? " + adicionado);

        // Verificando se um elemento está presente
        boolean contem = frutas.contains("Banana");
        System.out.println("O HashSet contém 'Banana'? " + contem);

        // Removendo um elemento do HashSet
        frutas.remove("Uva");

        // Exibindo o HashSet após a remoção
        System.out.println("Frutas após remoção: " + frutas);

        // Exibindo o tamanho do HashSet
        System.out.println("Tamanho do HashSet: " + frutas.size());
    }
}

