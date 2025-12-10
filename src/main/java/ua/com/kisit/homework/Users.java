package ua.com.kisit.homework;

import jdk.dynalink.linker.support.Lookup;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {

    private Long id;
    private String login;
    private String pass;
    private Accounts account;


    private Set<RolesHasUsers> rolesHasUsersSet = new HashSet<>();

}
