package ua.com.kisit.unit10.design_patterns.structural_patterns.decorator;

public class PanelDecorator extends Decorator{

    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("Panel Draw");
    }
}
