package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory;

import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple.HandApple;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple.HeadApple;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.apple.LegApple;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.ibm.HandIbm;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.ibm.HeadIbm;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.ibm.LegIbm;
import ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory.sony.HandSony;

public class MAin {

    public static void main(String[] args) {

        HandApple handApple = new HandApple();
        HeadApple headApple = new HeadApple();
        LegApple legApple = new LegApple();

        HandIbm handIbm = new HandIbm();
        HeadIbm headIbm = new HeadIbm();
        LegIbm legIbm = new LegIbm();

        HandSony handSony = new HandSony();


        RobotBase robot = new RobotBase();
        robot.setHand(handApple);
        robot.setHead(headApple);
        robot.setLeg(legApple);
        System.out.println(robot);
        robot.forward();


        RobotBase robot2 = new RobotBase();
        robot2.setHand(handSony);
        robot2.setHead(headIbm);
        robot2.setLeg(legApple);
        System.out.println(robot2);

    }

}
