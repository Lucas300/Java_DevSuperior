package curso_programacao.Desafios;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_test {
    public static void main(String[] args) {
        // Criação da Queue (Fila) usando LinkedList
        Queue<String> filaBanco = new LinkedList<>();

        // Adicionando pessoas à fila
        filaBanco.add("Ana");
        filaBanco.add("Bruno");
        filaBanco.add("Carla");
        filaBanco.add("Diego");

        // Exibindo a fila completa
        System.out.println("Fila inicial: " + filaBanco);

        // Atendendo a primeira pessoa (removendo da fila)
        String atendido = filaBanco.poll(); // poll() remove e retorna o primeiro elemento
        System.out.println("Atendendo: " + atendido);

        // Exibindo a fila após o atendimento
        System.out.println("Fila após atendimento: " + filaBanco);

        // Verificando quem é o próximo a ser atendido (sem remover da fila)
        String proximo = filaBanco.peek(); // peek() retorna o primeiro elemento sem removê-lo
        System.out.println("Próximo a ser atendido: " + proximo);
    }
}

