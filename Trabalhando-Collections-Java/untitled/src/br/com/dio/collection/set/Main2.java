package br.com.dio.collection.set;

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;



public class Main2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double coxinhasConsumidas, numeroParticipantes, mediaCoxinhas;

        numeroParticipantes = entrada.nextDouble();

        coxinhasConsumidas = entrada.nextDouble();

        mediaCoxinhas = numeroParticipantes/coxinhasConsumidas;

        System.out.printf("%.2f", mediaCoxinhas);

    }

}




