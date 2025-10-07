package ua.com.kisit.unit4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.add(4);
        set.add(4);

        System.out.println(set);


        // v.1
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Vasya");
        student1.setLastName("Pypkin");
        student1.setAge(20);

        System.out.println(student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Iva");
        student2.setLastName("Pypkina");
        student2.setAge(18);

        System.out.println(student2);

        // v.2
        Student student3 = new Student(3, "Ivanka", "Pypkina", 25);

        Student student4 = new Student(4, "Ivanka", "Pypkina", 25);


        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);


    }

}
