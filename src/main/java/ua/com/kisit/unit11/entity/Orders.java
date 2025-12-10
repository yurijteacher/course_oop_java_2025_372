package ua.com.kisit.unit11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orders {

    private Long id;
    private Date creationDate;
    private String payment;
    private String delivery;
    private Customers customer;


}
