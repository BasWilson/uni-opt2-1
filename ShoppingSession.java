import java.util.ArrayList;
import java.util.List;

public class ShoppingSession {
    public List<Product> products;

    public ShoppingSession() {
        this.products = new ArrayList<Product>();
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
}