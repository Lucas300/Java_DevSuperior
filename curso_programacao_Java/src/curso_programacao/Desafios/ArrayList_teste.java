package curso_programacao.Desafios;

import java.util.ArrayList;

public class ArrayList_teste{
    public static void main(String[] args) {
        // Criação do ArrayList
        ArrayList<String> listaCompras = new ArrayList<>();

        // Adicionando itens à lista de compras
        listaCompras.add("Maçãs");
        listaCompras.add("Bananas");
        listaCompras.add("Leite");
        listaCompras.add("Pão");

        // Exibindo a lista completa
        System.out.println("Lista de compras: " + listaCompras);

        // Removendo um item da lista (por nome)
        listaCompras.remove("Leite");

        // Exibindo a lista após a remoção
        System.out.println("Lista após remover 'Leite': " + listaCompras);

        // Adicionando mais um item à lista
        listaCompras.add("Ovos");

        // Exibindo a lista após adicionar um novo item
        System.out.println("Lista após adicionar 'Ovos': " + listaCompras);

        // Verificando o tamanho da lista
        System.out.println("Número de itens na lista: " + listaCompras.size());
    }
}

