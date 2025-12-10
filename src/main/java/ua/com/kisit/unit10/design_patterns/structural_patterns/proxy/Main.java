package ua.com.kisit.unit10.design_patterns.structural_patterns.proxy;

public class Main {
    public static void main(String[] args) {

        MyImage myImage = new MyImage("1.jpg");
        myImage.display();

        Proxy proxy = new Proxy("1.jpg");

        proxy.display();
    }
}
