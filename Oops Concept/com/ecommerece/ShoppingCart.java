public class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cart) {
            product.displayDetails();
            System.out.println();
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : cart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
