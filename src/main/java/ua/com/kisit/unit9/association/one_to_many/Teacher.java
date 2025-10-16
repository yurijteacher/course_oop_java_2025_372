package ua.com.kisit.unit9.association.one_to_many;

import java.util.HashSet;
import java.util.Set;

public class Teacher {

    private Set<Student> students = new HashSet<Student>();
}
