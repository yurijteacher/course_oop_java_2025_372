package ua.com.kisit.homework;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Authors {

    private Long id;
    private String firstName;
    private String lastName;
    private String description;
    private int age;

    private List<Books> books;


}
