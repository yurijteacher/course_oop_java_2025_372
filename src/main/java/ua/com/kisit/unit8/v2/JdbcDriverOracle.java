package ua.com.kisit.unit8.v2;

import java.util.List;

public class JdbcDriverOracle implements DriverJDBC{
    @Override
    public Object getConnection(String url, String username, String password) {
        return "get connection to Oracle";
    }

    @Override
    public void execute(String sql) {
        System.out.println("Execute SQL: " + sql);
    }

    @Override
    public void executeUpdate(String sql) {

    }

    @Override
    public List<Object> executeQuery(String sql) {
        return List.of();
    }
}
