package entities;

public class Product2 {
    public String name;
    public double price;
    public int quantity;

    public Product2() {

    }

    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProductsStock(int quantity) {
        this.quantity += quantity;
    }

    public void removeProductsStock(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
