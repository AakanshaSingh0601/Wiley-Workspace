package ecommerece;

public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String productName,int productId,double price,int quantityInStock, String brand, int warrantyPeriod){
        super(productName,productId,price,quantityInStock);
        this.brand= brand;
        this.warrantyPeriod=warrantyPeriod;
    }
    public Electronics(){

    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Electronics{" +
                "brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                '}');

    }

}
