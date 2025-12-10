package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.config.ConnectionToDb;
import ua.com.kisit.unit11.dao.CategoryDao;
import ua.com.kisit.unit11.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    private Connection connection;

//    Statement statement; //
//    PreparedStatement preparedStatement; //
//    CallableStatement callableStatement; //


    public CategoryRepository() {
        this.connection = getConnection();
    }

    @Override
    public List<Category> getAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from `category`");

            while (resultSet.next()) {

                Category category = new Category();
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));

                categories.add(category);
            }

            resultSet.close();
            statement.close();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }


        return categories;
    }

    @Override
    public Category getById(Long id) {
        Category category = new Category();

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from `category`  where id = " + id);

            while (resultSet.next()) {


                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));

            }

            resultSet.close();
            statement.close();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }


        return category;
    }

    @Override
    public void save(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` (`name`, `description`, `image`) VALUES " +
                    "('"+category.getName()+"', '"+category.getDescription()+"', '"+category.getImage()+"')");

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }  finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }

    }

    @Override
    public void update(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE `category` SET `name` = '"+category.getName()+"', `description` = '"+category.getDescription()+"', `image` = '"+category.getImage()+"' WHERE `id` = "+category.getId());

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {}
        }
    }

    }

    @Override
    public void delete(Category category) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category` WHERE `id` = "+category.getId());

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }
    }

    @Override
    public void delete(Long id) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category` WHERE `id` = "+id);

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }
    }

    @Override
    public void deleteAll() {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM `category`");

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
        }
    }
}
