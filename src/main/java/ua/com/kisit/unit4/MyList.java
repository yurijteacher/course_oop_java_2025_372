package ua.com.kisit.unit4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.add(10);

        System.out.println(list);
        System.out.println(list.get(3));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        list2.add(1, 6);

        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);


        List<Integer> list3 = new ArrayList<>(list2);
        list3.add(11);
        list3.add(12);
        list3.add(13);

        System.out.println(list3);

        list3.clear();

        System.out.println(list3);

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

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        List<Student> studentsSorted =  students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .toList(); //collect(Collectors.toList());

        System.out.println(studentsSorted);

        studentsSorted
                .stream()
                .filter(student -> student.getAge() > 18)
                .forEach(student -> System.out.println(student));

        studentsSorted
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .ifPresent(student -> System.out.println(student));

        studentsSorted
                .stream()
                .max(Comparator.comparing(Student::getAge))
                .ifPresent(student -> System.out.println(student));


        List<String> listFullName = studentsSorted
                .stream()
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .toList();

        listFullName.stream().map(string -> "Hello," + string).forEach(System.out::println);

        System.out.println(listFullName);


        students.add(student3);
        students.add(student3);
        System.out.println(students);

        listFullName
                .parallelStream()
                .map(string -> "Hello," + string)
                .forEach(System.out::println);



    }

}
