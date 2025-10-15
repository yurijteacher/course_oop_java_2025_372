package ua.com.kisit.unit8.v3;

import ua.com.kisit.unit8.v3.apple.HandApple;
import ua.com.kisit.unit8.v3.apple.HeadApple;
import ua.com.kisit.unit8.v3.apple.LegApple;
import ua.com.kisit.unit8.v3.ibm.HandIbm;
import ua.com.kisit.unit8.v3.ibm.HeadIbm;
import ua.com.kisit.unit8.v3.ibm.LegIbm;
import ua.com.kisit.unit8.v3.sony.HandSony;

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
