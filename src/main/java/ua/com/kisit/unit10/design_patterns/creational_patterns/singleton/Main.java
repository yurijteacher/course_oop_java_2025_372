package ua.com.kisit.unit10.design_patterns.creational_patterns.singleton;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        MySingleton test1 = MySingleton.getInstance();
        test1.print();
        MySingleton test2 = MySingleton.getInstance();
        test2.print();


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));


    }


}
