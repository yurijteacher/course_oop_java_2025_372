package ua.com.kisit.unit10.design_patterns.behavioral_design.template_method;

public class Football implements Game{
    @Override
    public void initialize() {
        System.out.println("Football initialize");
    }

    @Override
    public void play() {
        System.out.println("Football play");
    }

    @Override
    public void stop() {
        System.out.println("Football stop");
    }
}
