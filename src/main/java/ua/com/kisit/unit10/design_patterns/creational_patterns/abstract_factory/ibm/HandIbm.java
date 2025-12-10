package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.ibm;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Hand;

public class HandIbm implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("IbmApple");
    }
}
