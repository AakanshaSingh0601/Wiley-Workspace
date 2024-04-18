package ecommerece;

public class Clothing extends Product{
     private String size;
    private String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material){
        super(productName,productId,price,quantityInStock);
        this.size= size;
        this.material=material;
    }
    public Clothing(){
        super();

    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Clothing{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}');

    }
}
