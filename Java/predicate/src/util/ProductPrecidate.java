package predicate.src.util;

import java.util.function.Predicate;
import predicate.src.entities.*;

public class ProductPrecidate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {

        return p.getPrice() >= 100.00;
    }
}
