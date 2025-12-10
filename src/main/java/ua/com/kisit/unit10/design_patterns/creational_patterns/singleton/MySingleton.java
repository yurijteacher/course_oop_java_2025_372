package ua.com.kisit.unit10.design_patterns.creational_patterns.singleton;

public class MySingleton {

    private static MySingleton instance;

    public static MySingleton getInstance() {

        if (instance == null) {
            instance = new MySingleton();
        }

        return instance;
    }

    public void print(){
        System.out.println(this);
    }
}
