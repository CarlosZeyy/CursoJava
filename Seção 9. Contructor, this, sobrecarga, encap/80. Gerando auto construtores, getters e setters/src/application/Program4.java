package application;

import entities.Product4;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product4 product4 = new Product4(name, price);

            product4.setName("Computer");
            System.out.println("Updated name: " + product4.getName());
            product4.setPrice(1200);
            System.out.println("Updated price: " + product4.getPrice());

            System.out.println("\nProduct data: " + product4);

            System.out.print("\nEnter the number of products to be added in stock: ");
            int addStock = sc.nextInt();
            product4.addProductsStock(addStock);
            System.out.println("\nUpdated data: " + product4);

            System.out.print("\nEnter the number of products to be removed from stock: ");
            int removeStock = sc.nextInt();
            product4.removeProductsStock(removeStock);
            System.out.println("\nUpdated data: " + product4);

            sc.close();
        }
    }