package application;

import entities.Product3;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product3 product3 = new Product3(name, price);

        product3.setName("Computer");
        System.out.println("Updated name: " + product3.getName());
        product3.setPrice(1200);
        System.out.println("Updated price: " + product3.getPrice());

        System.out.println("\nProduct data: " + product3);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int addStock = sc.nextInt();
        product3.addProductsStock(addStock);
        System.out.println("\nUpdated data: " + product3);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int removeStock = sc.nextInt();
        product3.removeProductsStock(removeStock);
        System.out.println("\nUpdated data: " + product3);

        sc.close();
    }
}
