package ua.com.kisit.lab6;

public class Circle implements Shape{

    int radius = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("Circle::draw, x = " + x + ", y = " + y+", radius = " + radius );
    }
}
