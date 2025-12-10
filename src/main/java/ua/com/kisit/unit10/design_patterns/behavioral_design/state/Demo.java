package ua.com.kisit.unit10.design_patterns.behavioral_design.state;

public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
