package Exercicio;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamanho da Matriz: ");
        int N = entrada.nextInt();
        int M = entrada.nextInt();

        double[][] mat = new double[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = entrada.nextDouble();
            }
        }
        double[] vetor = new double[M];

        for (int i = 0; i < M; i++) {
            double soma = 0.0;
            for (int j = 0; j < N; j++) {
                soma = soma + mat[i][j];
            }
            vetor[i] = soma;

        }
        for (int i = 0; i < M; i++) {
            System.out.printf("%.1f%n", vetor[i]);
        }
        entrada.close();
    }
}
