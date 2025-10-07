package ua.com.kisit.lab2.my_clock;

public class Singleton {

    private static Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null) INSTANCE = new Singleton();
        return INSTANCE;
    }

    public void print() {
        System.out.println(this);
    }


}
