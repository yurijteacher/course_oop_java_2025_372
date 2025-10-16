package ua.com.kisit.unit9.association.many_to_many.v1;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Set<User> users = new HashSet<>();
}
