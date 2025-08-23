package application;

import entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product2 product2 = new Product2(name, price);

        System.out.println("\nProduct data: " + product2);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int addStock = sc.nextInt();
        product2.addProductsStock(addStock);
        System.out.println("\nUpdated data: " + product2);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int removeStock = sc.nextInt();
        product2.removeProductsStock(removeStock);
        System.out.println("\nUpdated data: " + product2);

        sc.close();
    }
}
