package ua.com.kisit.unit8.v3.sony;

import ua.com.kisit.unit8.v3.Hand;

public class HandSony implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("SonyHand");
    }
}
