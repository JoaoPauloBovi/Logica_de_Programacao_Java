package Exercicio;

import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome, idade e altura: ");

        int N = entrada.nextInt();
        String[] nomes = new String[N];
        int[] idade = new int[N];
        double[] altura = new double[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = entrada.next();
            idade[i] = entrada.nextInt();
            altura[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma = soma + altura[i];
        }

        double media = soma / N;
        System.out.printf("Altura média %.2f%n: ", media);

        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (idade[i] < 16) {
                cont++;

            }

        }
        double X = (double) cont * 100.0 / N;
        System.out.println("Pessoas com menos de 16 anos: " + X);

        entrada.close();
    }
}
