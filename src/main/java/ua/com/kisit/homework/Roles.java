package ua.com.kisit.homework;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Roles {

    private Long id;
    private String name;

    private Set<RolesHasUsers> rolesHasUsersSet = new HashSet<>();

}
