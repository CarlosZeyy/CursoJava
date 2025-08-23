package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product69;

public class Program {
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

        System.out.printf("\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f\n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("\nEnter the number of products to be added in stock: ");
        int addStock = sc.nextInt();
        product.addProductsStock(addStock);
        System.out.printf("\nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f", product.name, product.price, product.quantity, product.totalValueInStock());


        System.out.print("\n\nEnter the number of products to be removed in stock: ");
        int removeStock = sc.nextInt();
        product.removeProductsStock(removeStock);
        System.out.printf("\nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f", product.name, product.price, product.quantity, product.totalValueInStock());
    }
}
