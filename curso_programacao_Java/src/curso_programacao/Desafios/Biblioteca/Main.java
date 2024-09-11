package curso_programacao.Desafios.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("A Revolução dos Bichos", "George Orwell");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando membros
        Membro membro1 = new Membro("Alice");
        Membro membro2 = new Membro("João");

        // Adicionando membros à biblioteca
        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);

        // Emprestar livros
        biblioteca.emprestarLivro(livro1, membro1);
        biblioteca.emprestarLivro(livro2, membro2);

        // Listar livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Devolver livros
        biblioteca.devolverLivro(livro1, membro1);
        biblioteca.devolverLivro(livro2, membro2);

        // Listar livros disponíveis após devoluções
        biblioteca.listarLivrosDisponiveis();
    }
}
