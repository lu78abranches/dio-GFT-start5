package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int quantidadeNumero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de n�meros: ");
        quantidadeNumero = scan.nextInt();

        int count = 0;

        do {
            System.out.println("N�mero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;


        } while ( count < quantidadeNumero);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade �mpares: " + quantImpares);

    }
}
