package model;

public class Sale {
    private Cart cart;
    private double totalAmount;

    public Sale(Cart cart){
        this.cart = cart;
        this.totalAmount = cart.getTotalCartValue();
    }
    
    public Sale(Cart cart, double discount){
        this.cart = cart;
        this.totalAmount = cart.getTotalCartValue() - discount;
    }

    public Cart getCart() {
        return cart;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    
}
