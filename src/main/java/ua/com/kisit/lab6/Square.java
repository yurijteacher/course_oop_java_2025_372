package ua.com.kisit.lab6;

public class Square implements Shape {

    int a = 20;

    @Override
    public void draw(int x, int y) {
        System.out.println("Square::draw, x = " + x + ", y = " + y +", a=" +a);
    }
}
