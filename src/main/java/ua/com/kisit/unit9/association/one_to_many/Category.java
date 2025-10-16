package ua.com.kisit.unit9.association.one_to_many;

import java.util.List;

public class Category
{

    private Long id;
    private String name;
    private String description;
    private String image;

    private List<Product> products;

    public Category() {
    }

    public Category(Long id, String name, String description, String image, List<Product> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
