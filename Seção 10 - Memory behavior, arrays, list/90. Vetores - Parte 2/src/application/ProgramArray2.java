package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArray2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        Product[] productArray = new Product[n];


        for (int i = 0; i < productArray.length; i++) {
            System.out.printf("Digite o nome e preço do item %d: \n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            productArray[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < productArray.length; i++) {
            sum += productArray[i].getPrice();
        }

        double avg = sum / productArray.length;

        System.out.printf("AVG Price: %.2f", avg);

        sc.close();
    }
}
