package ua.com.kisit.unit9.association.many_to_many;

public class Main {

    public static void main(String[] args) {

        Role role1 = new Role(1L, "Admin");
        Role role2 = new Role(2L, "Manager");
        Role role3 = new Role(3L, "User");

        User user = new User(1L, "Vasya","1234");
        User user2 = new User(2L, "Iva","1111");
        User user3 = new User(3L, "Ivanka","2222");

        RolesHasUsers rolesHasUsers = new RolesHasUsers();
        rolesHasUsers.setUser(user);
        rolesHasUsers.setRole(role1);

        RolesHasUsers rolesHasUsers2 = new RolesHasUsers();
        rolesHasUsers2.setUser(user);
        rolesHasUsers2.setRole(role2);

        RolesHasUsers rolesHasUsers3 = new RolesHasUsers();
        rolesHasUsers3.setUser(user);
        rolesHasUsers3.setRole(role3);

        RolesHasUsers rolesHasUsers4 = new RolesHasUsers();
        rolesHasUsers4.setUser(user2);
        rolesHasUsers4.setRole(role1);



    }

}
