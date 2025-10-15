package ua.com.kisit.unit8.v1;

public class Calc implements Calculation{

    public static void main(String[] args) {

        Calc calc = new Calc();

        System.out.println(calc.add(5, 10));
        System.out.println(calc.sub(10, 5));

        System.out.println(Calculation.mul(5, 5));
        System.out.println(calc.div(5, 5));

    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

}
