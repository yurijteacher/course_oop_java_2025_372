package ua.com.kisit.unit8.v1;

public interface Calculation {

    double x=5;

    double add(double a, double b);
    double sub(double a, double b);

    static double mul(double a, double b){
        return a*b;
    };

    default double div(double a, double b){
        return (b!=0) ? a/b : 0;
    };



}
