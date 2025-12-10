package ua.com.kisit.unit11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customers {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private Users user;

}
