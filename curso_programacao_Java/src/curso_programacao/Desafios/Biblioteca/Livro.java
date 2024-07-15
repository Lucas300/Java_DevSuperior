package curso_programacao.Desafios.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean estaEmprestado;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estaEmprestado = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public boolean isEmprestado() {
        return estaEmprestado;
    }
    
    public void emprestar() {
        if (!estaEmprestado) {
            estaEmprestado = true;
        }
    }
    
    public void devolver() {
        if (estaEmprestado) {
            estaEmprestado = false;
        }
    }
    
    @Override
    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", emprestado=" + estaEmprestado + '}';
    }
}

