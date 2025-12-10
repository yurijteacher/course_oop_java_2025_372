package ua.com.kisit.lab6;

public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Point::draw, x = " + x + ", y = " + y);
    }
}
