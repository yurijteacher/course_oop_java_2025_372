package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.sony;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.Hand;

public class HandSony implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("SonyHand");
    }
}
