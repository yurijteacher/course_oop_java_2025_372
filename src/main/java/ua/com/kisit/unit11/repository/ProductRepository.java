package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.config.ConnectionToDb;
import ua.com.kisit.unit11.dao.ProductDao;
import ua.com.kisit.unit11.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDb implements ProductDao {

    Connection connection;

    public ProductRepository() {
        this.connection = getConnection();
    }

    @Override
    public List<Products> getAll() {

        List<Products> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet =  null;
        try {
            preparedStatement = connection.prepareStatement("select * from `products`");

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Products product = new Products();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                product.setPrice(resultSet.getBigDecimal("price"));

                product.setCategory(new CategoryRepository().getById(resultSet.getLong("category_id")));

                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
        }


        return products;
    }

    @Override
    public Products getById(Long id) {

        Products product = new Products();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet =  null;
        try {
            preparedStatement = connection.prepareStatement("select * from `products` where id = ?");
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                product.setPrice(resultSet.getBigDecimal("price"));

                product.setCategory(new CategoryRepository().getById(resultSet.getLong("category_id")));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
        }
        return product;
    }

    @Override
    public void save(Products product) {

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO `products` (`name`, `description`, `price`, `image`, `category_id`) VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBigDecimal(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());

            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }

        }


    }

    @Override
    public void update(Products product) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE `products` SET `name` = ?, `description` = ?, `price` = ?, `image` = ?, `category_id` = ? WHERE `id` = ?");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBigDecimal(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());
            preparedStatement.setLong(6, product.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }

    }

    @Override
    public void delete(Products product) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM `products` WHERE `id` = ?");
            preparedStatement.setLong(1, product.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteAll() {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM `products`");

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }
    }
}
