package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.ibm;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Leg;

public class LegIbm implements Leg {
    @Override
    public void go() {
        System.out.println("LegIbm");
    }
}
