package Exercicio;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Base: ");
        double base = entrada.nextDouble();


        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));


        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.4f%n", diagonal);

        entrada.close();

    }
}
