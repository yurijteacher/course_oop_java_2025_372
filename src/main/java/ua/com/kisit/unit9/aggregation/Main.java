package ua.com.kisit.unit9.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setId(1L);
        engine.setName("Seat 2000");


        Car car = new Car(engine);
        car.setId(1L);
        car.setName("Seat 3");


        Engine engine2 = new Engine();
        engine.setId(2L);
        engine.setName("Seat 3000");

        Engine engine3 = car.getEngine();
        car.setEngine(engine2);
        System.out.println(car);


    }
}
