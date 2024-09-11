package curso_programacao.Desafios.Biblioteca;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;

    // Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    // Adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Adicionar um membro à biblioteca
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    // Emprestar um livro
    public void emprestarLivro(Livro livro, Membro membro) {
        if (!livro.isEmprestado()) {
            membro.emprestarLivro(livro);
            System.out.println(membro.getNome() + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " já está emprestado.");
        }
    }

    // Devolver um livro
    public void devolverLivro(Livro livro, Membro membro) {
        if (livro.isEmprestado()) {
            membro.devolverLivro(livro);
            System.out.println(membro.getNome() + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está emprestado.");
        }
    }

    // Exibir os livros disponíveis na biblioteca
    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }
}
