package ua.com.kisit.unit10.design_patterns.structural_patterns.bridge;

public class Main {

    public static void main(String[] args) {

        Car car = new SportCar(new BMW());

        Car car2 = new CityCar(new Seat());

    }

}
