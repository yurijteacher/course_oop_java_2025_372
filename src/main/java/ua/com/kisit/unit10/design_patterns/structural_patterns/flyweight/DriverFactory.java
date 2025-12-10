package ua.com.kisit.unit10.design_patterns.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    Map<String, Driver> drivers = new HashMap<>();



    public Driver getDriver(String name) {

        Driver driver = drivers.get(name);

        if (driver == null) {

            switch (name) {
                case "mysql":
                    driver = new MySQLDriver();
                    break;
                case "postgres":
                    driver = new PostgresqlDriver();
                    break;
                default:
                    driver = null;
            }

            drivers.put(name, driver);
        }

        return driver;
    }


}
