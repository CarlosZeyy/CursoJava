import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);

        sc.close();

        System.out.println("incremento");

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("Decremento");

        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
    }
}