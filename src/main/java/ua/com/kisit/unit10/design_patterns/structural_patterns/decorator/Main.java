package ua.com.kisit.unit10.design_patterns.structural_patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new ColorDecorator(new PanelDecorator(new ColorDecorator(new ColorDecorator(new TextComponent()))));
        component.draw();


    }

}
