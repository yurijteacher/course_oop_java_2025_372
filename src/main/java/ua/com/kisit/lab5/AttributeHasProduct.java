package ua.com.kisit.lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AttributeHasProduct {

    private Long id;
    private Attribute attribute;
    private Products product;

}
