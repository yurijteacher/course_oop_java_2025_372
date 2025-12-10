package ua.com.kisit.lab5;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Products {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;

    private Categories category;
}
