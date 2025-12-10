package ua.com.kisit.unit10.design_patterns.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.name = "Kisit";
        robot.model = "T1000";
        robot.color = "black";

        List<Robot> robots = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            robots.add(robot.clone("name"+i, "T1000"+i, robot.color + new Random().nextInt(10)));
        }

        for (Robot el : robots) {
            System.out.println(el);
        }


    }

}
