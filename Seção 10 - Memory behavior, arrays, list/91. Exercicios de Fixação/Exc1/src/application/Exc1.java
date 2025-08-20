package application;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc vai digitar: ");
        int qtdN = sc.nextInt();

        if (qtdN > 10) return;

        int[] numbers = new int[qtdN];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Digite o %d° numero: ", i + 1);
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
