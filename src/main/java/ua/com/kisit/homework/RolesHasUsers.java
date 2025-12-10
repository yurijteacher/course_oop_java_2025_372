package ua.com.kisit.homework;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RolesHasUsers {

    private Long id;
    private Roles role;
    private Users user;

}
