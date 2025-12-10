package ua.com.kisit.unit10.design_patterns.structural_patterns.facade;

public class Main {

    public static void main(String[] args) {

        Hello hello = new Hello();
        World world = new World();
        hello.print();
        world.print();
        System.out.print("!");

        new Facade().print();
    }

    public void printHello() {
        new Facade().print();
    }

}
