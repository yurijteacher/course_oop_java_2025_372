package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Head;

public class HeadApple implements Head {
    @Override
    public void calculation() {
        System.out.println("HeadApple");
    }
}
