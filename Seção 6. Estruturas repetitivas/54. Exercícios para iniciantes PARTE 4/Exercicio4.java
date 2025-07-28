import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            double v = sc.nextInt();
            double d = sc.nextInt();

            if ( d == 0) {
                System.out.println("Divisao impossivel");
                System.out.printf("=============\n");
            } else {
                double conta = v / d;

                System.out.printf("%.2f\n", conta);
                System.out.printf("=============\n");
            }
        }

        sc.close();
    }
}