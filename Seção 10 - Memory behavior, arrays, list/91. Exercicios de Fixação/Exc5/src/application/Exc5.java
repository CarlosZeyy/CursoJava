package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int nQtd = sc.nextInt();

        double[] numbers = new double[nQtd];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double maior = numbers[0];
        int position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
                position = i;
            }
        }
        System.out.print("\nMaior valor: " + maior);
        System.out.print("\nPosição do maior valor: " + position);
    }
}
