package Exercicio;

import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Tamanho da Matriz: ");

        int N = entrada.nextInt();
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Diagonal Vertical: ");
        for (int i = 0; i < N; i++) {
            System.out.println(mat[i][i] + " ");

        }
        System.out.println();
        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de negativos = " + cont);

        entrada.close();
    }
}
