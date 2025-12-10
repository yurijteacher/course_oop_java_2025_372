package ua.com.kisit.unit10.design_patterns.structural_patterns.adapter.v1;

import ua.com.kisit.unit9.association.many_to_many.User;

public class UserAdapter extends User implements UserDetails {
    @Override
    public String setUser() {
        return getUsername();
    }

    @Override
    public String setPass() {
        return getPassword();
    }
}
