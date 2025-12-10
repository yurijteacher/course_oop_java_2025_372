package ua.com.kisit.lab5;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductsHasOrders {
    private Long id;

    private Products product;
    private Orders order;
    private int quantity;

}
