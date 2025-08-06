package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Exc1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        double w, h;

        System.out.println("Enter rectangle width and height: ");

        w = sc.nextDouble();
        h = sc.nextDouble();

        System.out.printf("Area = %.2f", rectangle.area(w, h));
        System.out.printf("\nPerimeter = %.2f", rectangle.perimeter(w, h));
        System.out.printf("\nDiagonal = %.2f", rectangle.diagonal(w, h));

        sc.close();
    }
}
