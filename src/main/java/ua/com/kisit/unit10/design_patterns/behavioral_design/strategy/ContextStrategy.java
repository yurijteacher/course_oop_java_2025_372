package ua.com.kisit.unit10.design_patterns.behavioral_design.strategy;

public class ContextStrategy implements Strategy{

    Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double execute(double x, double y) {
        return strategy.execute(x,y);
    }
}
