package ua.com.kisit.lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Delivery {

    private Long id;
    private Address address;

    private String name;
}
