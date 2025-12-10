package ua.com.kisit.unit11.repository;

import ua.com.kisit.unit11.config.ConnectionToDb;
import ua.com.kisit.unit11.dao.ClientDao;
import ua.com.kisit.unit11.entity.Users;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository extends ConnectionToDb implements ClientDao {

    Connection connection = null;

    public UserRepository() {
        this.connection = getConnection();
    }


    @Override
    public void save(Users users) {

        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call saveNewUser(?,?)}");
            callableStatement.setString(1, users.getUsername());
            callableStatement.setString(2, users.getPassword());
            callableStatement.execute();

            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }



    @Override
    public List<Users> getAll() {

        List<Users> users = new ArrayList<>();

        CallableStatement callableStatement = null;
        ResultSet resultSet  = null;

        try {
            callableStatement = connection.prepareCall("{call findAllUser()}");

            resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                Users user = new Users();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }

            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {}
            }
        }

        return users;
    }

    @Override
    public Users getById(Long id) {

        Users user = new Users();

        CallableStatement callableStatement = null;
        ResultSet resultSet  = null;

        try {
            callableStatement = connection.prepareCall("{call findUserById(?)}");
            callableStatement.setLong(1, id);

            resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {

                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }

            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {}
            }
        }

        return user;
    }



    @Override
    public void update(Users users) {

        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call updateUser(?,?, ?)}");
            callableStatement.setString(1, users.getUsername());
            callableStatement.setString(2, users.getPassword());
            callableStatement.setLong(3, users.getId());
            callableStatement.executeUpdate();

            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void delete(Users users) {

        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call deleteById(?)}");
            callableStatement.setLong(1, users.getId());
            callableStatement.executeUpdate();

            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {}
            }
        }


    }

    @Override
    public void delete(Long id) {
        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call deleteById(?)}");
            callableStatement.setLong(1, id);
            callableStatement.executeUpdate();

            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {}
            }
        }
    }

    @Override
    public void deleteAll() {
        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call deleteAllUsers()}");
            callableStatement.executeUpdate();

            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException e) {}
            }
        }

    }
}
