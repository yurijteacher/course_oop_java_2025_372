package ua.com.kisit.unit10.design_patterns.creational_patterns.factory_methods;

public class Main {

    public static void main(String[] args) {

        String name = "mysql";

        DriverFactory factory = new DriverFactory();
        Driver driver = factory.getDriver(name);
        System.out.println(driver.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"));

        driver.executeCommand("insert into ...");
        System.out.println(driver.executeQuery("select * from table"));


    }

}
