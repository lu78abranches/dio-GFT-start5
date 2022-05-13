package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;
        double maior = 0;
        double soma = 0;

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count ++;

        }while(count < 5);

        System.out.println("maior: " + maior);
        System.out.println("media: " + soma / 5);
    }
}
