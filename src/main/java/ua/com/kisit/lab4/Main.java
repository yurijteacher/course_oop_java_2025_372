package ua.com.kisit.lab4;

import ua.com.kisit.lab5.Categories;
import ua.com.kisit.lab5.Products;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Categories category = new Categories();
        category.setDescription("beer descr");
        category.setId(1L);
        category.setName("beer");
        category.setImage("/static/1.jpg");

        Categories category2 = new Categories();
        category2.setDescription("car descr");
        category2.setId(2L);
        category2.setName("car");
        category2.setImage("/static/2.jpg");

        Products product = new Products();
        product.setId(1L);
        product.setName("beer1");
        product.setDescription("beer1");
        product.setPrice(new BigDecimal(12));
        product.setCategory(category);

        Products product2 = new Products();
        product2.setId(2L);
        product2.setName("beer2");
        product2.setDescription("beer2 ...");
        product2.setPrice(new BigDecimal(24));
        product2.setCategory(category);

        Products car1 = new Products();
        car1.setId(3L);
        car1.setName("Seat 2000");
        car1.setDescription("Seat 2000");
        car1.setPrice(new BigDecimal(1200000));
        car1.setCategory(category2);


        List<Products> productsList = new ArrayList<>();
        productsList.add(product);
        productsList.add(car1);
        productsList.add(product2);

        System.out.println(productsList);

        productsList
                .stream()
                .filter(e->e.getCategory().getId().equals(1L))
                .forEach(ee-> System.out.println(ee));


        System.out.println("/");
        productsList
                .stream()
                .filter(e->e.getCategory().getId().equals(2L))
                .forEach(ee-> System.out.println(ee));









    }

}
