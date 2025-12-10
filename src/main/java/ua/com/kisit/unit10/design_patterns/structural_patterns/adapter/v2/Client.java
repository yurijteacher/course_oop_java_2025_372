package ua.com.kisit.unit10.design_patterns.structural_patterns.adapter.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Client implements UserDetails {

    private Long id;
    private String username;
    private String password;

    @Override
    public String setUser() {
        return username;
    }

    @Override
    public String setPass() {
        return password;
    }
}
