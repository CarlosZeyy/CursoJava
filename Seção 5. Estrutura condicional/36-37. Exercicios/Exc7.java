import java.util.Scanner;
import java.util.Locale;

public class Exc7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X, Y;

        System.out.println("Digite os valores dos Eixos X e Y: ");
        System.out.println("Eixo X: ");
        X = sc.nextDouble();
        System.out.println("Eixo Y: ");
        Y = sc.nextDouble();

        System.out.println("Quadrante: ");

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}