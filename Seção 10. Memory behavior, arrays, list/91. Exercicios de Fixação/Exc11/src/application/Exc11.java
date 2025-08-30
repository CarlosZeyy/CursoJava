package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nPessoas;

        System.out.print("Quantas pessoas serão digitadas: ");
        nPessoas = sc.nextInt();

        double[] height = new double[nPessoas];
        char[] genders = new char[nPessoas];

        for (int i = 0; i < nPessoas; i++) {
            System.out.printf("Altura da %d° pessoa: ", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Genero da %d° pessoa: ", i + 1);
            genders[i] = sc.next().charAt(0);
        }

        double lowHeight = height[0];
        double highHeight = height[0];

        for (int i = 0; i < nPessoas; i++) {
            if (height[i] < lowHeight) {
                lowHeight = height[i];
            }

            if (height[i] > highHeight) {
                highHeight = height[i];
            }
        }

        int qtdMen = 0, qtdFem = 0;
        double heightFem = 0.0;

        for (int i = 0; i < nPessoas; i++) {
            if (genders[i] == 'M') {
                qtdMen++;
            } else {
                qtdFem ++;
                heightFem += height[i];
            }
        }

        double heightFemMedia = heightFem / qtdFem;

        System.out.printf("Menor altura: %.2f", lowHeight);
        System.out.printf("\nMaior altura: %.2f", highHeight);
        System.out.printf("\nMedia das alturas da mulheres: %.2f", heightFemMedia);
        System.out.printf("\nNumero de homens: %d", qtdMen);

        sc.close();
    }
}
