package ua.com.kisit.unit4;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "C");
        myMap.put(2, "Java");
        myMap.put(3, "JS");
        myMap.put(4, "C++");

        System.out.println(myMap.get(2));

        System.out.println(myMap);

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        myMap.remove(1);
        System.out.println(myMap);


    }


}
