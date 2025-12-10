package ua.com.kisit.homework;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Genre {

    private Long id;
    private String genreName;
    private String description;

    private List<Books> books;

}
