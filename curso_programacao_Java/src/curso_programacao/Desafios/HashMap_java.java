package curso_programacao.Desafios;

import java.util.HashMap;

public class HashMap_java {
    public static void main(String[] args) {
        // Criando um HashMap 
        HashMap<String, String> capitais = new HashMap<>();

        // Adicionando os estados ao Hashmap
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        // Procurando a capital 
        String estado = "RJ";
        String capital = capitais.get(estado);

        // Exibindo 
        if (capital != null) {
            System.out.println("A capital do estado de " + estado + " é " + capital);
        } else {
            System.out.println("Estado não encontrado.");
        }
    }
}
