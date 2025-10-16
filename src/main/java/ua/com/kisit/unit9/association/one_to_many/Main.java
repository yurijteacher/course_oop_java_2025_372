package ua.com.kisit.unit9.association.one_to_many;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("car");
        category.setDescription("car description");
        category.setImage("/categories/images/1.jpg");


        Product product = new Product();
        product.setId(1L);
        product.setName("BMW 7");
        product.setDescription("BMW 7 description");
        product.setImage("/categories/images/2.jpg");
        product.setPrice(new BigDecimal(45000000));
        product.setCategory(category);


        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("BMW 5");
        product2.setDescription("BMW 5 description");
        product2.setImage("/categories/images/3.jpg");
        product2.setPrice(new BigDecimal(55000000));
        product2.setCategory(category);

        List<Product> products =  new ArrayList<>();
        products.add(product);
        products.add(product2);

        category.setProducts(products);

        System.out.println(category);

        System.out.println(product);
        System.out.println(product2);


    }

}
