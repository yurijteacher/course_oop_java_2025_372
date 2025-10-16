package ua.com.kisit.unit9.composition;

public class MAin {

    public static void main(String[] args) {

        Car car = new Car();
        car.setId(1L);
        car.setName("Seat 3");

        System.out.println(car);

    }
}
