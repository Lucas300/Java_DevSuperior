package curso_programacao.Desafios;

public class NumerosPrimos {

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int inicio = 1; 
        int fim = 100;  

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
