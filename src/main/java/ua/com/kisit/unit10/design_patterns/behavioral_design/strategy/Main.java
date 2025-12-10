package ua.com.kisit.unit10.design_patterns.behavioral_design.strategy;

public class Main {

    public static void main(String[] args) {

        StrategyMul strategy = new StrategyMul();

        ContextStrategy contextStrategy = new ContextStrategy(strategy);
        System.out.println(contextStrategy.execute(1, 2));

        StrategySub strategy2 = new StrategySub();
        contextStrategy.setStrategy(strategy2);
        System.out.println(contextStrategy.execute(1, 2));

    }

}
