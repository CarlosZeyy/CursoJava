import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um numero: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("PAR");
        } else {
            System.out.printf("IMPAR");
        }

        sc.close();
    }
}