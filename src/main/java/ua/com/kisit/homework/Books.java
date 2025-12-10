package ua.com.kisit.homework;

import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString

public class Books {

    private Long id;
    private String title;
    private Set<Authors> authors =  new HashSet<>();
    private Publisher publisher;
    private Set<Genre> genre = new HashSet<>();
    private Date publishedDate;
    private int pages;


}
