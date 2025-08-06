package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product69;

public class Program68 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product69 product = new Product69();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int addStock = sc.nextInt();
        product.addProductsStock(addStock);
        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int removeStock = sc.nextInt();
        product.removeProductsStock(removeStock);
        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}
