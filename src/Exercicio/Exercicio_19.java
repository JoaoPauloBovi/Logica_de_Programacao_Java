package Exercicio;

import java.util.Scanner;

public class    Exercicio_19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int N = entrada.nextInt();

        double[] vetor = new double[N];
        for (int i = 0; i < N; i++) {  //primeiro for para criar o vetor [0.0, 0.1, 0.2]
            vetor[i] = entrada.nextDouble();
        }
        for (int i = 0; i < N; i++) { //segundo for para ler toda a linha do vetor
            System.out.printf("%.2f%n", vetor[i]);
        }

        entrada.close();
    }
}
