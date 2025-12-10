package ua.com.kisit.lab5;

import javax.management.relation.Role;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Customers customer = new Customers();
        customer.setId(1L);
        customer.setFirstName("Vasya");
        customer.setLastName("Pypkin");
        customer.setEmail("v1@ukr.net");
        customer.setPhone("51323");



        Users user = new Users();
        user.setId(1L);
        user.setLogin("vasya");
        user.setPassword("1234");


        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("manager");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("user");

        Set<Roles> rolesList = new HashSet<>();
        rolesList.add(role1);
        rolesList.add(role2);

        user.setRoles(rolesList);

        customer.setUser(user);
        System.out.println(customer);


        Categories category = new Categories();
        category.setId(1L);
        category.setName("car");
        category.setDescription("asddf asd  sa d ");
        category.setImage("/static/1.jpg");

        Products product = new Products();
        product.setId(1L);
        product.setName("bmw-5");
        product.setDescription("description");
        product.setImage("/static/2.jpg");
        product.setPrice(new BigDecimal(5000000.45));
        product.setCategory(category);

        System.out.println(product);

        Products product2 = new Products();
        product2.setId(2L);
        product2.setName("bmw-7");
        product2.setDescription("description ...");
        product2.setImage("/static/3.jpg");
        product2.setPrice(new BigDecimal(5000000));
        product2.setCategory(category);
        System.out.println(product2);

        Orders order = new Orders();
        order.setId(1L);
        order.setCustomer(customer);
        order.setDateCreated(new Date());

        Delivery delivery = new Delivery();
        order.setDelivery(delivery);

        Payment payment = new Payment();
        order.setPayment(payment);

        System.out.println(order);


        ProductsHasOrders productsHasOrder1 = new ProductsHasOrders();
        productsHasOrder1.setId(1L);
        productsHasOrder1.setProduct(product);
        productsHasOrder1.setOrder(order);
        productsHasOrder1.setQuantity(1);

        System.out.println(productsHasOrder1);

        ProductsHasOrders productsHasOrder2 = new ProductsHasOrders();
        productsHasOrder2.setId(2L);
        productsHasOrder2.setProduct(product2);
        productsHasOrder2.setOrder(order);
        productsHasOrder2.setQuantity(1);
        System.out.println(productsHasOrder2);

        List<ProductsHasOrders> productsHasOrdersList = new ArrayList<>();
        productsHasOrdersList.add(productsHasOrder1);
        productsHasOrdersList.add(productsHasOrder2);

        System.out.println(productsHasOrdersList);

    }
}
