import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codeProduct, quantity;
        double price = 0, total, totalAmount;

        System.out.println("Digite o codigo do produto: ");
        codeProduct = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantity = sc.nextInt();

        if (codeProduct == 1) {
            System.out.printf("Cachorro quente");
            price = 4.00;
        } else if (codeProduct == 2) {
            System.out.printf("X-Salada");
            price = 4.50;
        } else if (codeProduct == 3) {
            System.out.printf("X-Bacon");
            price = 5.00;
        } else if (codeProduct == 4) {
            System.out.printf("Torrada simples");
            price = 2.00;
        } else if (codeProduct == 5) {
            System.out.printf("Refrigerante");
            price = 1.50;
        } else {
            System.out.printf("Valor de codigo inválido");
        }

        if (price != 0.0) {
            totalAmount = price * quantity;
            System.out.printf("\nTotal: %.2f", totalAmount);
        }
        sc.close();
    }
}