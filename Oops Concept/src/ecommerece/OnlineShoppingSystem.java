package ecommerece;

import java.util.Scanner;

class OnlineShoppingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ShoppingCart s = new ShoppingCart();
        while(true){
            System.out.println("1.Add Product \n 2.View Cart \n 3.Total Price \n 4. Exit Program ");
            int choice = sc.nextInt();
            if(choice==4) break;
            if(choice==1){
                String productName = sc.next();
                int productId = sc.nextInt();
                double price = sc.nextDouble();
                int quantityInStock = sc.nextInt();
                String brand = sc.next();
                int warrantyPeriod = sc.nextInt();
                Electronics e = new Electronics(productName,productId,price,quantityInStock,brand,warrantyPeriod);
                s.addProduct(e);
            }
            if(choice==2){
                s.cardDisplay();
            }
            if(choice==3){
                int total=s.price();
                System.out.println(total);
            }
        }







    }
}
//    public Electronics(String productName,
//    int productId,double price,int quantityInStock, String brand, int warrantyPeriod){
//    In the testing phase, simulate user input for adding electronics and clothing to the shopping cart.