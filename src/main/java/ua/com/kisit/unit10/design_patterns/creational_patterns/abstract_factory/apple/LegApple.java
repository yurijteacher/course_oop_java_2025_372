package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Leg;

public class LegApple implements Leg {
    @Override
    public void go() {
        System.out.println("LegApple");
    }
}
