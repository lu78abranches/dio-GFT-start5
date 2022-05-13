package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;


        while (true) {
            System.out.println("nota: ");
            nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) break;
            else {

                System.out.println("Nota invalida");
            }
        }

    }
}
