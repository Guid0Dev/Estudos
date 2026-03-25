package service;

import model.Cart;
import model.Sale;

public class SaleService {

    public Sale finalizeSale(Cart cart){
        if(cart == null) {
            throw new IllegalArgumentException("Cart cannot be null");
        }
        if(cart.getTotalItems() == 0) {
            throw new IllegalArgumentException("Cart is empty");
        }
    return new Sale(cart);
    }
    public Sale finalizeSale(Cart cart, double discount){
        double total = cart.getTotalCartValue();
        if(discount < 0){
            throw new IllegalArgumentException("Discount cannot be negative value.");
        }
        if(discount > total){
            throw new IllegalArgumentException("Discount cannot bigger the total value of sale.");
        }
        
        return new Sale(cart, discount);
    }
}
