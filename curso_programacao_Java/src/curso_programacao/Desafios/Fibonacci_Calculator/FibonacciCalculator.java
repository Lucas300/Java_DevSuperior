package curso_programacao.Desafios.Fibonacci_Calculator;

public class FibonacciCalculator {

    public int[] generateFibonacciSequence(int length) {
        int[] sequence = new int[length];
        if (length > 0) {
            sequence[0] = 0;
        }
        if (length > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }

    public int calculateSum(int[] sequence) {
        int sum = 0;
        for (int number : sequence) {
            sum += number;
        }
        return sum;
    }
}

