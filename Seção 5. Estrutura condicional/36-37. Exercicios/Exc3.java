import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.printf("Sao Multiplos");
        } else {
            System.out.printf("Nao sao Multiplos");
        }

        sc.close();
    }
}