package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Hand;

public class HandApple implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("HandApple");
    }
}
