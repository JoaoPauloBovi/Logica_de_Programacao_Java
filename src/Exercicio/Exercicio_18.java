package Exercicio;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = entrada.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente a Fahrenheit: %.2f%n", F);

            System.out.println("Repetir(s/n)?: ");
            repetir = entrada.next().charAt(0);

        } while (repetir != 'n');


        entrada.close();
    }
}
