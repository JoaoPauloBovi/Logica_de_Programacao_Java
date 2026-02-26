package Exercicio;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N, sobra, horas, minutos, segundos;

        System.out.println("Digite quantos segundos: ");
        N = entrada.nextInt();

        horas = N / 3600;
        sobra = N % 3600;

        minutos = sobra / 60;
        segundos = sobra % 60;

        System.out.printf("São " + horas+":" + minutos + ":" + segundos);

        entrada.close();
    }
}
