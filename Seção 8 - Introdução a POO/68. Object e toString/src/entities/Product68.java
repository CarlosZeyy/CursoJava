package entities;

public class Product68 {
    public String name;
    public double price;
    public int quantity;


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
