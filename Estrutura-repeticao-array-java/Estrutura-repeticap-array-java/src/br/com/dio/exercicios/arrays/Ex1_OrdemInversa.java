package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, 3, -10, 8, 7, -20};

        System.out.print("Vetor: ");
        int count = 0;

        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length) - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
