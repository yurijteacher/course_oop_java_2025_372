package ua.com.kisit.unit10.design_patterns.creational_patterns.builder;

public class BuilderCar {

    private Engine engine = Engine.s1600;
    private Transmission transmission = Transmission.AUTOMATIC;
    private SizeCar sizeCar = SizeCar.medium;
    private Color color = Color.BLUE;
    private String year = "2025";
    private String model = "Seat-2000";

    public BuilderCar setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public BuilderCar setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public BuilderCar setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
        return this;
    }

    public BuilderCar setColor(Color color) {
        this.color = color;
        return this;
    }

    public BuilderCar setYear(String year) {
        this.year = year;
        return this;
    }

    public BuilderCar setModel(String model) {
        this.model = model;
        return this;
    }


    public Car build() {
        Car car = new Car();
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setSizeCar(sizeCar);
        car.setColor(color);
        car.setYear(year);
        car.setModel(model);
        return car;
    }

}
