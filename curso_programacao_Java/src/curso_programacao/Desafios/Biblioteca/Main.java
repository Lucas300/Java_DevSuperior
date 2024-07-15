package curso_programacao.Desafios.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        while (true) {
            System.out.println("\nSistema de Gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (opcao) {
                case 1:
                    System.out.print("Título do Livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor do Livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("Título do Livro para Empréstimo: ");
                    titulo = scanner.nextLine();
                    biblioteca.emprestarLivro(titulo);
                    break;
                case 4:
                    System.out.print("Título do Livro para Devolução: ");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLivro(titulo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
