package ecommerece;

public class Product {
    private String productName;
    private int productId;
     double price;
    private int quantityInStock;

    public Product(String productName,int productId,double price,int quantityInStock){
        this.productName= productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock=quantityInStock;
    }

    public Product(){

    }
    public void displayDetails(){
        System.out.println("Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}');
    }
}
