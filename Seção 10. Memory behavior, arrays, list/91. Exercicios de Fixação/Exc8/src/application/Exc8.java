package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nQtd, somaPar = 0, nPar = 0;
        double mediaPar;

        System.out.print("Quantos elementos vai ter o veotr? ");
        nQtd = sc.nextInt();

        int[] numbers = new int[nQtd];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                somaPar += numbers[i];
                nPar++;
            }
        }

        if (nPar == 0) {
            System.out.println("Nenhum numero par");
        } else {
            mediaPar = (double) somaPar / nPar;
            System.out.printf("Media dos pares: %.1f\n", mediaPar);
        }

        sc.close();
    }
}
