package curso_programacao.Desafios.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    
    public void emprestarLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null && !livro.isEmprestado()) {
            livro.emprestar();
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }
    
    public void devolverLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null && livro.isEmprestado()) {
            livro.devolver();
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou não está emprestado.");
        }
    }
}

