package ua.com.kisit.unit8.v2;

import java.util.List;

public class JdbcDriverPostgres implements DriverJDBC{

    @Override
    public Object getConnection(String url, String username, String password) {
        return "get connection to PostgreSQL";
    }

    @Override
    public void execute(String sql) {
        System.out.println("insert to PostgreSQL");
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update to PostgreSQL");
    }

    @Override
    public List<Object> executeQuery(String sql) {
        return List.of("select * from `table` PostgreSQL DB");
    }
}
