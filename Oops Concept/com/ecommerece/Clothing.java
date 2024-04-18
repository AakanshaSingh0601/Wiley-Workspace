public class Clothing extends Product{
    private String size;
    private String material;

    public Electronics(String productName,int productId,double price,int quantityInStock, String size, int material){
        super(productName,productId,price,quantityInStock);
        this.size= size;
        this.material=material;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size : " +size);
        System.out.println("Material : " + material);

    }
}
