package ua.com.kisit.unit10.design_patterns.behavioral_design.strategy;

public class StrategySub implements Strategy{
    @Override
    public double execute(double x, double y) {
        return x-y;
    }
}
