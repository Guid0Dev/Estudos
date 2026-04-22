package function.src.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import function.src.entities.Product;
import function.src.util.UpperCaseName;

public class App {
    public static void main(String[] args) {
            List<Product> list = new ArrayList<>();

            list.add(new Product("TV" , 900.00));
            list.add(new Product("Mouse", 50.00));
            list.add(new Product("Tablet", 350.50));
            list.add(new Product("HD Case", 80.90));

            List<String> names = list.stream()
                .map(new UpperCaseName())
                .collect(Collectors.toList());

            names.forEach(System.out::println);
    }
}
