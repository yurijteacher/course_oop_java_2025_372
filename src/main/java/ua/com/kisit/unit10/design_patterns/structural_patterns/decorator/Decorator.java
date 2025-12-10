package ua.com.kisit.unit10.design_patterns.structural_patterns.decorator;

public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void draw() {
        component.draw();

        afterDraw();
    }

    public abstract void afterDraw();
}
