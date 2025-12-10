package ua.com.kisit.unit11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductHasOrder {

    private Long id;
    private Products product;
    private Orders order;
    private int quantity;

}
