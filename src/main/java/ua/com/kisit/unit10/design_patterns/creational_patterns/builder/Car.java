package ua.com.kisit.unit10.design_patterns.creational_patterns.builder;

public class Car {


    private Engine engine;
    private Transmission transmission;
    private SizeCar sizeCar;
    private Color color;
    private String year;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(Engine engine, Transmission transmission, SizeCar sizeCar, Color color, String year, String model) {
        this.engine = engine;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public Car() {
    }

    public Car(Engine engine, Transmission transmission, SizeCar sizeCar, Color color, String year) {
        this.engine = engine;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
        this.color = color;
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public SizeCar getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", sizeCar=" + sizeCar +
                ", color=" + color +
                ", year='" + year + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
