package ua.com.kisit.unit10.design_patterns.creational_patterns.prototype;

public class Robot implements Cloneable {

    String name = "robot-model";
    String model = "T1000n";
    String color = "black";

    public Robot() {
    }

    public Robot(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    @Override
    public Robot clone(String name, String model, String color) {
        return new Robot(name, model, color);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
