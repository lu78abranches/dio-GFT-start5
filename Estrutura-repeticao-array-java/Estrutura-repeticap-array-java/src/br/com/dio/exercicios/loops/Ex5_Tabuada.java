package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: " );
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);
        int count = 0;
        for (int numero = 1;  numero <= 10; numero++ ) {
          int resultadoTabuada = tabuada * numero;
          count++;
            System.out.println( tabuada + " x " + count + " = " + resultadoTabuada);

        }
    }
}
