import java.util.List;
import java.util.ArrayList;
import model.Product;

public class ProductRepository {
private List<Product> product new ArrayList<>();

    public void addProduct(Product product){
        product.add(product);
    }

    public void removeProduct(Product product){
        product.remove(product);
    }

    public List<Product> list(){
        return products;
    }
}