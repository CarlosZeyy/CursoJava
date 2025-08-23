package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar: ");
        int nQtn = sc.nextInt();

        int[] numbers = new int[nQtn];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numeros pares: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Quantidade de pares: ");
        int qtdPares = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.print(qtdPares);
    }
}
