package curso_programacao.Desafios.notas_alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        System.out.println("Quantos alunos você deseja adicionar?");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            
            System.out.println("Nota 1 do aluno " + nome + ": ");
            double nota1 = scanner.nextDouble();
            
            System.out.println("Nota 2 do aluno " + nome + ": ");
            double nota2 = scanner.nextDouble();
            
            System.out.println("Nota 3 do aluno " + nome + ": ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            
            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
            alunos.add(aluno);
        }
        
        System.out.println("\nAlunos abaixo da média:");
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media < 7.0) {
                System.out.printf("Nome: %s - Média: %.2f\n", aluno.getNome(), media);
            }
        }
        
        scanner.close();
    }
}
