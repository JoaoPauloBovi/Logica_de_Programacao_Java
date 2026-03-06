package Exercicio;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tabuada ?");
        int N = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            int soma = i * N;
            System.out.println(i + " x " + N + " = " + soma);

        }
        entrada.close();
    }
}