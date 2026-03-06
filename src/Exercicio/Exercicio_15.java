package Exercicio;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int soma = 0;

        for (int a = 0; a < N; a++) {
            int x = entrada.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
        entrada.close();
    }

}
//    for(int a = 0, a < 5, a++){
//        System.out.println("Valor de a: " + a);
//    }