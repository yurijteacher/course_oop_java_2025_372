package ua.com.kisit.unit10.design_patterns.creational_patterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();

        Car car = builderCar
                .setSizeCar(SizeCar.small)
                .setEngine(Engine.s2500)
                .setTransmission(Transmission.MANUAL)
                .build();

        System.out.println(car);
    }

}
