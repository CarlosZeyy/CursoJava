package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int nQtd = sc.nextInt();

        double[] numbers = new double[nQtd];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println("Media do vetor: ");
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double media = sum / numbers.length;

        System.out.print(media);

        System.out.println("\nElementos abaixo da media: ");
        double abaixoMedia;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < media) {
                abaixoMedia = numbers[i];
                System.out.println(abaixoMedia);
            }
        }
    }
}
