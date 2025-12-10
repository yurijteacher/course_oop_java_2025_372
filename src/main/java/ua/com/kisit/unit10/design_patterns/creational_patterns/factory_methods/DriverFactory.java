package ua.com.kisit.unit10.design_patterns.creational_patterns.factory_methods;

public class DriverFactory {

    public Driver getDriver(String name) {

        Driver driver = null;

        switch (name) {
            case "mysql": driver = new MySQLDriver();
            break;
            case "postgres": driver = new PostgresqlDriver();
            break;
            default:
                driver = null;
        }

        return driver;
    }


}
