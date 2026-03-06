package Exercicio;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite X: ");
        int X = entrada.nextInt();
        System.out.println("Digite Y: ");
        int Y = entrada.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            X = entrada.nextInt();
            Y = entrada.nextInt();
        }

        entrada.close();
    }
}