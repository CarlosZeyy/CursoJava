package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros vc vai digitar: ");
        int qtdN = sc.nextInt();

        double[] numbers = new double[qtdN];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Digite o %d° numero: ", i + 1);
            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = sum / qtdN;

        System.out.println("Valores: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f  ", numbers[i]);
        }

        System.out.printf("\nSoma: %.2f", sum);
        System.out.printf("\nMedia: %.2f", avg);
    }
}
