package ua.com.kisit.unit8.v2;

public class Main {

    public static void main(String[] args) {

        String driver = "postgres";

        DriverJDBC driverJDBC = null;

        switch (driver) {
            case "mysql":
                driverJDBC = new JdbcDriverMySQL();
                break;
            case "postgres":
                driverJDBC = new JdbcDriverPostgres();
                break;
            case "oracle":
                driverJDBC = new JdbcDriverOracle();
                break;
        }

        System.out.println(driverJDBC.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"));
        driverJDBC.execute("insert ...");



    }

}
