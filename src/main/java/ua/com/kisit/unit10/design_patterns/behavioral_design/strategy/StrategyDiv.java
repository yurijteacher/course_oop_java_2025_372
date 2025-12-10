package ua.com.kisit.unit10.design_patterns.behavioral_design.strategy;


public class StrategyDiv implements Strategy {
    @Override
    public double execute(double x, double y) {
        return (y==0) ? 0 : x / y;
    }
}
