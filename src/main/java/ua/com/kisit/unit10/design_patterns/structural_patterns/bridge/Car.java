package ua.com.kisit.unit10.design_patterns.structural_patterns.bridge;

public abstract class Car {

    Maker maker;
    public Car(Maker maker) {
        this.maker = maker;
    }

    public abstract void detailsCar();

}
