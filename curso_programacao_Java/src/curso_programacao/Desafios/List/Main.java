package curso_programacao.Desafios.List;

//src/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {

 public static void main(String[] args) {
     // Cria uma lista de nomes
     List<String> nomes = new ArrayList<>();

     // Adiciona alguns nomes à lista
     adicionarNome(nomes, "Alice");
     adicionarNome(nomes, "Bob");
     adicionarNome(nomes, "Charlie");

     // Exibe os nomes na lista
     exibirNomes(nomes);

     // Remove um nome da lista
     removerNome(nomes, "Bob");

     // Exibe os nomes na lista após a remoção
     exibirNomes(nomes);
 }

 // Método para adicionar um nome à lista
 public static void adicionarNome(List<String> lista, String nome) {
     lista.add(nome);
     System.out.println(nome + " foi adicionado à lista.");
 }

 // Método para remover um nome da lista
 public static void removerNome(List<String> lista, String nome) {
     if (lista.remove(nome)) {
         System.out.println(nome + " foi removido da lista.");
     } else {
         System.out.println(nome + " não está na lista.");
     }
 }

 // Método para exibir os nomes na lista
 public static void exibirNomes(List<String> lista) {
     System.out.println("Nomes na lista:");
     for (String nome : lista) {
         System.out.println(nome);
     }
 }
}
