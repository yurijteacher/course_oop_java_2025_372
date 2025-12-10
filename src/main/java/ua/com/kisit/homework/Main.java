package ua.com.kisit.homework;


import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Genre genre = new Genre();
        genre.setId(1L);
        genre.setGenreName("Drama");
        Set<Genre> genres = new HashSet<>();
        genres.add(genre);

        Authors author = new Authors();
        author.setId(1L);
        author.setFirstName("Vasya");
        author.setLastName("Pypkin");
        author.setAge(18);
        author.setDescription("...");

        Set<Authors> authors= new HashSet<>();
        authors.add(author);

        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("Ab-ba-ba");
        publisher.setDescription("...");
        publisher.setAddressPublisher("Address Publisher");

        Books book = new Books();
        book.setId(1L);
        book.setTitle("Title");
        book.setAuthors(authors);
        book.setPublisher(publisher);
        book.setPublishedDate(new Date());
        book.setGenre(genres);
        book.setPages(200);

        System.out.println(book);


        Books book2 = new Books();
        book2.setId(1L);
        book2.setTitle("Title2");
        book2.setAuthors(authors);
        book2.setPublisher(publisher);
        book2.setPublishedDate(new Date());
        book2.setGenre(genres);
        book2.setPages(500);

        System.out.println(book);

        List<Books> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        books
                .stream()
                .filter(b -> b.getTitle().equals("Title2"))
                .forEach(b -> System.out.println(b));

        Users user = new Users();
        user.setId(1L);
        user.setLogin("Vasya");
        user.setPass("1234");

        Clients client = new Clients();
        client.setId(1L);
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setEmail("va@ukr.net");
        client.setPhone(51343);
        client.setUser(user);

        Roles role = new Roles();
        role.setId(1L);
        role.setName("admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("user");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("manager");

        Set<Roles> roles = new HashSet<>();
        roles.add(role);
        roles.add(role2);
        roles.add(role3);

        RolesHasUsers rolesHasUsers = new RolesHasUsers();
        rolesHasUsers.setId(1L);
        rolesHasUsers.setRole(role);
        rolesHasUsers.setUser(user);

        RolesHasUsers rolesHasUsers2 = new RolesHasUsers();
        rolesHasUsers2.setId(2L);
        rolesHasUsers2.setRole(role2);
        rolesHasUsers2.setUser(user);

        Set<RolesHasUsers> rolesHasUsersSet = new HashSet<>();
        rolesHasUsersSet.add(rolesHasUsers);
        rolesHasUsersSet.add(rolesHasUsers2);

        rolesHasUsersSet.stream().filter(el->el.getRole().equals(role)).forEach(el -> System.out.println(el));

        Accounts accounts = new Accounts();
        accounts.setId(1L);
        accounts.setUser(user);
        accounts.setBalance(new BigDecimal(1000.00));

        System.out.println(accounts);
    }

}
