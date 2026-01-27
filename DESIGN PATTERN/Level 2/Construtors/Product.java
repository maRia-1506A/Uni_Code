public class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId= productId;
        this.productName= productName;
        this.price= price;
    }

    public static void main(String[] args) {
        Product pr= new Product(11, "Foundation", 3500);
        System.out.println(pr.productName);
    }
}
