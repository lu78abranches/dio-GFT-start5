package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();


        System.out.print("Telefonou para a vítima?: ");
        Object pergunta1 = scan.nextLine();
        perguntas.add((String) pergunta1);

        System.out.print("Esteve no local do crime?: ");
        Object pergunta2 = scan.nextLine();
        perguntas.add((String) pergunta2);

        System.out.print("Mora perto da vítima?: ");
        Object pergunta3 = scan.nextLine();
        perguntas.add((String) pergunta3);

        System.out.print("Devia para a vítima?: ");
        Object pergunta4 = scan.nextLine();
        perguntas.add((String) pergunta4);

        System.out.print("Já trabalhou com a vítima?: ");
        Object pergunta5 = scan.nextLine();
        perguntas.add((String) pergunta5);

        System.out.println(perguntas.toString());

        int count = 0;
        Iterator<String> contador = perguntas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;

        }


    }
}

