package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        System.out.println("Digite a altura: ");
        double[] heightArray = new double[n];

        for (int i = 0; i < n; i++) {
            heightArray[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < n; i++) {
            sum += heightArray[i];
        }

        double avg = sum / n;

        System.out.printf("Average height: %.2f", avg);

        sc.close();
    }
}
