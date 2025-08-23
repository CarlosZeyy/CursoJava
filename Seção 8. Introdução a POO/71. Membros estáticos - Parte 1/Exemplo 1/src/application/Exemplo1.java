package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static final double PI = 3.14; //* para definir uma variavel como "const" tem que ter esse final depois do static e o padrão de nomes para const no java que é que todas as letras estejam em CAPSLOCK.

    public static void main(String[] args) { //* Se uma função é static todas as outras no escopo devem ser static também. Se uma for static e outra não, não será possivel chamar elas na função.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter in radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
