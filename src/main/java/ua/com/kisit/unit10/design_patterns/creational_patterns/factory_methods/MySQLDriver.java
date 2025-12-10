package ua.com.kisit.unit10.design_patterns.creational_patterns.factory_methods;

import java.util.List;

public class MySQLDriver implements Driver {
    @Override
    public Object getConnection(String url, String user, String password) {
        return "connection to MySQL Server";
    }

    @Override
    public void executeCommand(String sql) {
        System.out.println("Executing MySQL command: " + sql);
    }

    @Override
    public List<String> executeQuery(String sql) {
        return List.of("3","2","1");
    }
}
