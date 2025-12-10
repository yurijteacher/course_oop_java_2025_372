package ua.com.kisit.unit10.design_patterns.structural_patterns.flyweight;

import java.util.List;

public class PostgresqlDriver implements Driver {
    @Override
    public Object getConnection(String url, String user, String password) {
        return "connection to PostgreSQL server";
    }

    @Override
    public void executeCommand(String sql) {
        System.out.println("Executing PostgreSQL command: " + sql);
    }

    @Override
    public List<String> executeQuery(String sql) {
        return List.of("1","2");
    }
}
