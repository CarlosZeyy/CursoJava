package entities;

public class Product {
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
}
