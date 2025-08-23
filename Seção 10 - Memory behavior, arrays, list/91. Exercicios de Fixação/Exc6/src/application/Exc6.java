package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos valores vai ter cada vetor? ");
        int nQtd = sc.nextInt();

        int[] vetA = new int[nQtd];
        int[] vetB = new int[nQtd];
        int[] vetC = new int[nQtd];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("Valores resultante: ");
        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i]);
        }
    }
}
