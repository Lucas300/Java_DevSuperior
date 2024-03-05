package curso_programacao.ComportamentoDeMemoria_array_listas;

public class For_each {

	public static void main(String[] args) {
		
		/*
		 for(Tipo apelido: coleção){
		 	<comando 1>
		 	<comando 2>
		 }
		 */
		
		 String[] vect = new String[] {"Maria","Bob","Alex"};
		//vectString é um apelido que recebe o valor do vetor vect 
         for (String vecString : vect) {
			System.out.println(vecString);
		}

	}

}
