package ua.com.kisit.lab6;

public class Main {

    public static void main(String[] args) {

        FactoryShare factoryShare = new FactoryShare();

        Shape c = factoryShare.getShape("коло");
        c.draw(50, 50);

        Shape c1 = factoryShare.getShape("коло");
        c1.draw(70, 70);

        if(c1.hashCode() == c.hashCode()) {
            System.out.println("true");
        }
    }

}
