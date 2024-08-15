package curso_programacao.Desafios;

public class sequenciaDeFibonacci {
	public static void main(String[] args) {
        int n = 10; // Quantos números da sequência você quer gerar
        int[] fib = new int[n];

        if (n > 0) {
            fib[0] = 0;
        }
        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
