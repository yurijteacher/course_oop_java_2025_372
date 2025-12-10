package ua.com.kisit.unit11;

import ua.com.kisit.unit11.entity.Category;
import ua.com.kisit.unit11.entity.Products;
import ua.com.kisit.unit11.entity.Users;
import ua.com.kisit.unit11.repository.CategoryRepository;
import ua.com.kisit.unit11.repository.ProductRepository;
import ua.com.kisit.unit11.repository.UserRepository;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepository();
        Category category = new Category();

        category.setName("car");
        category.setDescription("car description");
        category.setImage("/images/car.jpg");
//        categoryRepository.save(category);

        List<Category> categoryList = categoryRepository.getAll();

        for (Category c : categoryList) {
            System.out.println(c);
        }

        Category category2 = categoryRepository.getById(2L);

        Products product1 = new Products();

        product1.setName("BMW-1");
        product1.setDescription("car description");
        product1.setImage("/images/bmw.jpg");
        product1.setPrice(new BigDecimal(15000.0));
        product1.setCategory(category2);

        ProductRepository productRepository = new ProductRepository();
//        productRepository.save(product1);

        List<Products> productsList = productRepository.getAll();
        for (Products p : productsList) {
            System.out.println(p);
        }

        UserRepository userRepository = new UserRepository();
        Users user = new Users();
        user.setUsername("admin");
        user.setPassword("admin1234");

//        userRepository.save(user);

        List<Users> usersList = userRepository.getAll();
        for (Users u : usersList) {
            System.out.println(u);
        }

        Users user2 = userRepository.getById(1L);
        System.out.println(user2);

        user2.setPassword("2222");

        userRepository.update(user2);
        System.out.println(userRepository.getById(1L));




    }

}
