package curso_programacao.Desafios;

import java.util.Stack;

public class Stack_pilha {
    public static void main(String[] args) {
        // Criação da Stack
        Stack<Integer> pilha = new Stack<>();

        // Empilhando (push) elementos na pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Exibindo a pilha completa
        System.out.println("Pilha: " + pilha);

        // Acessando o elemento do topo da pilha sem removê-lo (peek)
        int topo = pilha.peek();
        System.out.println("Elemento no topo: " + topo);

        // Desempilhando (pop) o elemento do topo da pilha
        int removido = pilha.pop();
        System.out.println("Elemento removido: " + removido);

        // Exibindo a pilha após a remoção
        System.out.println("Pilha após remover o topo: " + pilha);

        // Verificando se a pilha está vazia
        boolean estaVazia = pilha.isEmpty();
        System.out.println("A pilha está vazia? " + estaVazia);
    }
} 

