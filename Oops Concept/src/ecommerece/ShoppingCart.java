package ecommerece;

import java.util.*;

class ShoppingCart{

    List<Product> cart = new ArrayList<>();

    public void addProduct(Product p){
        cart.add(p);
    }

    public void cardDisplay(){
        for(Product c:cart){
            c.displayDetails();
        }
    }
    public int price(){
        int sumP=0;
        for(Product p: cart){
            sumP+=p.price;
        }
        return sumP;
    }
}