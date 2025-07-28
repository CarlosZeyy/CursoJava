import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours;

        System.out.println("Digite o horario: ");
        hours = sc.nextInt();

        if (hours < 12) {
            System.out.println("Bom dia");
        } else if (hours < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}