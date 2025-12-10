package ua.com.kisit.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Clients {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String description;

    private Users user;
}
