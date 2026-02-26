package Exercicio;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = entrada.next();

        System.out.println("Qual o sua idade? ");
        double idade = entrada.nextDouble();

        System.out.println("Qual o seu nome? ");
        String nome2 = entrada.next();

        System.out.println("Qual o sua idade? ");
        double idade2 = entrada.nextDouble();


        double media = (idade + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.2f", nome, nome2, media);

        entrada.close();
    }
}
