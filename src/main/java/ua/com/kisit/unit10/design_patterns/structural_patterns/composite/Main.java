package ua.com.kisit.unit10.design_patterns.structural_patterns.composite;

public class Main {

    public static void main(String[] args) {

        Robot1 robot1 = new Robot1();
        Robot2 robot2 = new Robot2();
        Robot3 robot3 = new Robot3();

        CompositeRobot composite1= new CompositeRobot();
        composite1.addComposite(robot1);
        composite1.addComposite(robot2);

        CompositeRobot composite2= new CompositeRobot();
        composite2.addComposite(robot3);
        composite2.addComposite(robot1);

        CompositeRobot composite3= new CompositeRobot();
        composite2.addComposite(robot2);

        CompositeRobot composite4= new CompositeRobot();

        composite4.addComposite(composite1);
        composite4.addComposite(composite2);
        composite4.addComposite(composite3);
        composite4.addComposite(robot3);

        composite4.action();

        robot1.action();


    }
}
