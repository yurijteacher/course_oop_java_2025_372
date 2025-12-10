package ua.com.kisit.unit10.design_patterns.structural_patterns.flyweight;

import java.util.List;

public interface Driver {


    Object getConnection(String url, String user, String password);
    void executeCommand(String sql);
    List<String> executeQuery(String sql);

}
