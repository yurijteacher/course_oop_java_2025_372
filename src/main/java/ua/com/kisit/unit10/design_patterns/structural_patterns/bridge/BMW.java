package ua.com.kisit.unit10.design_patterns.structural_patterns.bridge;

public class BMW implements Maker{
    @Override
    public void setMaker() {
        System.out.println("This is a BMW maker.");
    }
}
