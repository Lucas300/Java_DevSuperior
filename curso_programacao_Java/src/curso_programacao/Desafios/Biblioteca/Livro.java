package curso_programacao.Desafios.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    // Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Exibe informações sobre o livro
    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
