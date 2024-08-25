package curso_programacao.Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        //Lista
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Escolhas
        int opcao;
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Adicionar número");
            System.out.println("2. Remover número");
            System.out.println("3. Listar números");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:                
                    System.out.print("Digite o número que deseja adicionar: ");
                    int numeroParaAdicionar = scanner.nextInt();
                    numeros.add(numeroParaAdicionar);//adicionando item a lista
                    System.out.println("Número adicionado com sucesso!");
                    break;
                   
                case 2:
                    if (numeros.isEmpty()) {
                        System.out.println("A lista está vazia, não há números para remover.");
                    } else {
                        System.out.print("Digite o número que deseja remover: ");
                        int numeroParaRemover = scanner.nextInt();
                        if (numeros.contains(numeroParaRemover)) {
                            numeros.remove(Integer.valueOf(numeroParaRemover));// Removendo um número da lista
                            System.out.println("Número removido com sucesso!");
                        } else {
                            System.out.println("Número não encontrado na lista.");
                        }
                    }
                    break;
                   
                    // Listando todos os números
                case 3:
                    if (numeros.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Números na lista: " + numeros);
                    }
                    break;
                    
                case 4:
                    System.out.println("Saindo...");//finalizando o programa
                    break;
                   
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 4);
        scanner.close();
    }
}