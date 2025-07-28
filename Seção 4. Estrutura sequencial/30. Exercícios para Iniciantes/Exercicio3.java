import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diference;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diference = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + diference);
        sc.close();
    }
}