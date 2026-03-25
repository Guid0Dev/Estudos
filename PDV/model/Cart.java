package model;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<Product> products;
    
    public Cart(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalCartValue(){
        double total = 0;

        for (Product product : products){
            total += product.getTotalValue();
        }
        return total;
    }
    public void showProducts(){
        for (Product product : products) {
            System.out.println(product.getName() +
                                " | Price: " + product.getPrice() +
                                " | Quantity: " + product.getQuantity() +
                                " | Total: " + product.getTotalValue());
        }
    }
    public int getTotalItems(){
        int totalItems = 0;

        for(Product product : products){
            totalItems += product.getQuantity();
        }
        return totalItems;
    }
}
