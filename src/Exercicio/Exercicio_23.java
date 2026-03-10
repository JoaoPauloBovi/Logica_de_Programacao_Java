package Exercicio;

import java.util.Scanner;

public class Exercicio_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // M = Linhas N = Colunas
        System.out.println("Quantidade de linhas: ");
        int M = entrada.nextInt();
        System.out.println("Quantidade de colunas: ");
        int N = entrada.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
