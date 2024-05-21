package curso_programacao.biblioteca;

public class Program {

	public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "Inglês");
        Autor autor2 = new Autor("Gabriel Garcia Marquez", "Colombiano");

       
        Livro livro1 = new Livro("1984", autor1, 1949);
        Livro livro2 = new Livro("Cem Anos de Solidão", autor2, 1967);

        
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

   
        System.out.println(biblioteca);


        Livro livroEncontrado = biblioteca.buscarPorTitulo("1984");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado);
        } else {
            System.out.println("Livro não encontrado");
        }
	}

}
