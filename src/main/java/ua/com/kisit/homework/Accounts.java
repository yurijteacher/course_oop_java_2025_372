package ua.com.kisit.homework;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Accounts {
    private Long id;
    private BigDecimal balance;
    private Users user;
}
