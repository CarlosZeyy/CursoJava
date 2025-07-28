import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double area, raio, pi = 3.14159;

        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("Area: %.4f", area);
        sc.close();
    }
}