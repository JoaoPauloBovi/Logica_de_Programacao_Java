package Exercicio;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int idade = entrada.nextInt();
        int soma = 0;
        int cont = 0;

        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            System.out.println("Digite outro numero: ");
            idade = entrada.nextInt();

        }
        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("Impossivel Calcular");
        }
        entrada.close();

    }
}
