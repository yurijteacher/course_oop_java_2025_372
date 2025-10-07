package ua.com.kisit.lab2.my_clock;

import java.util.Timer;

public class Main2 {

    public static void main(String[] args) {

//        Calendar calendar = Calendar.getInstance();

//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.HOUR));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));
//        System.out.println(calendar.get(Calendar.DATE));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.YEAR));

            Singleton test1 = Singleton.getInstance();
            test1.print();
            Singleton test2 = Singleton.getInstance();
            test2.print();

            Timer timer = new Timer();

            timer.schedule(new MyClock(), 1000, 1000);


    }
}
