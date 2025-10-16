package ua.com.kisit.unit9.association.many_to_many;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RolesHasUsers> getRolesHasUsers() {
        return rolesHasUsers;
    }

    public void setRolesHasUsers(List<RolesHasUsers> rolesHasUsers) {
        this.rolesHasUsers = rolesHasUsers;
    }

    private List<RolesHasUsers> rolesHasUsers;

}
