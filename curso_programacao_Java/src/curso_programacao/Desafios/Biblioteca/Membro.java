package curso_programacao.Desafios.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private List<Livro> livrosEmprestados;

    // Construtor
    public Membro(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Emprestar um livro
    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        livro.setEmprestado(true);
    }

    // Devolver um livro
    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        livro.setEmprestado(false);
    }

    // Exibe informações do membro e os livros emprestados
    @Override
    public String toString() {
        return "Membro: " + nome + " | Livros emprestados: " + livrosEmprestados.size();
    }
}
