package ua.com.kisit.unit10.design_patterns.structural_patterns.bridge;

public class CityCar extends Car{

    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    public void detailsCar() {
        maker.setMaker();
        System.out.println("This is a car from City!");
    }
}
