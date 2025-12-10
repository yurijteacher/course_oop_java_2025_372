package ua.com.kisit.unit10.design_patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRobot implements Component{

    private List<Component> composite= new ArrayList<>();

    public void addComposite(Component component){
        composite.add(component);
    }

    public void removeComposite(Component component){
        composite.remove(component);
    }

    @Override
    public void action() {
        for(Component component : composite){
            component.action();
        }
    }
}
