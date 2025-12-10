package ua.com.kisit.unit11.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {

    private Long id;
    private String username;
    private String password;

}
