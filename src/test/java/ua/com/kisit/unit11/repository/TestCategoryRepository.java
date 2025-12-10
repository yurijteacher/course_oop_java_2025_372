package ua.com.kisit.unit11.repository;

import org.junit.Test;
import ua.com.kisit.unit11.entity.Category;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestCategoryRepository {

    CategoryRepository categoryRepository = new CategoryRepository();

    @Test
    public void Test1(){

        int a = 3;
        int b = 5;

        int c = 3+5;

        assertEquals(8, c);
    }

    @Test
    public void Test2(){

        int a = 3;
        int b = 5;

        int c = 5-3;

        assertEquals(2, c);
    }

    @Test
    public void Test3(){

        Category category = new Category();
//
        category.setName("apple");
        category.setDescription("test");

//        categoryRepository.save(category);

        Category category2 = categoryRepository.getById(6L);
        assertEquals("apple", category2.getName());
    }

    @Test
    public void Test4(){
        List<Category> categoryList = categoryRepository.getAll();
        assertEquals(6, categoryList.size());
    }

}
