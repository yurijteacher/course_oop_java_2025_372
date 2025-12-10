package ua.com.kisit.unit10.design_patterns.behavioral_design.template_method;

public class Basketball implements Game{
    @Override
    public void initialize() {
        System.out.println("Basketball initialize");
    }

    @Override
    public void play() {
        System.out.println("Basketball play");
    }

    @Override
    public void stop() {
        System.out.println("Basketball stop");
    }
}
