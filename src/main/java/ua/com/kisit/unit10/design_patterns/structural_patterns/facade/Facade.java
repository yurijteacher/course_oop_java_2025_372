package ua.com.kisit.unit10.design_patterns.structural_patterns.facade;

public class Facade {

    public void print() {
        Hello hello = new Hello();
        World world = new World();
        hello.print();
        world.print();
        System.out.print("!");
    }

}
