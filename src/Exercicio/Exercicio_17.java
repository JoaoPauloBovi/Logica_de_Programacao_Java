package Exercicio;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int X, Y;

        System.out.println("Primeiro valor: ");
        X = entrada.nextInt();
        System.out.println("Segundo valor: ");
        Y = entrada.nextInt();

        int min, max;
        if (X < Y) {
            min = X;
            max = Y;

        } else {
            min = Y;
            max = X;

        }
        int soma = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma = soma + 1;

            }
        }
        System.out.println(soma);
        entrada.close();
    }
}