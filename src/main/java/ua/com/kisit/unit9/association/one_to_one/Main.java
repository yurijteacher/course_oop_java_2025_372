package ua.com.kisit.unit9.association.one_to_one;

public class Main {

    public static void main(String[] args) {

        User user = new User(1L, "Vasya", "1234");

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setUser(user);
        customer.setFirstName("Вася");
        customer.setLastName("Пупкін");
        customer.setEmail("vasya@ukr.net");
        customer.setPhone("51323");
        customer.setAge(17);

        System.out.println(user);

        System.out.println(customer);
    }

}
