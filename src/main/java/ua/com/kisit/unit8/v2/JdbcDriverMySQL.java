package ua.com.kisit.unit8.v2;

import java.util.List;

public class JdbcDriverMySQL implements DriverJDBC{

    @Override
    public Object getConnection(String url, String username, String password) {
        return "get connection to MySQL";
    }

    @Override
    public void execute(String sql) {
        System.out.println("insert to MySQL DB");
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update to MySQL DB");
    }

    @Override
    public List<Object> executeQuery(String sql) {
        return List.of("select * from MySQL DB");
    }
}
