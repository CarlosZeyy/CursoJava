import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um numero: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.printf("Positivo.");
        } else if (number < 0) {
            System.out.printf("Negativo.");
        } else {
            System.out.printf("Neutro");
        }

        sc.close();
    }
}