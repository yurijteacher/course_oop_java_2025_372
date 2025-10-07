package ua.com.kisit.unit6;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    protected double course = 0;
    protected double distance = 0;

    private double speed = 100;

    private List<RobotLine> robotLines = new ArrayList<>();

    public List<RobotLine> getRobotLines() {
        return robotLines;
    }

    public void setRobotLines(List<RobotLine> robotLines) {
        this.robotLines = robotLines;
    }

    public void forward() {
        double templX = x;
        double templY = y;

        x += distance * cos(PI*course/180);
        y += distance * sin(PI*course/180);

        // v.1
//        RobotLine robotLine = new RobotLine(templX, templY, x, y);
//        robotLines.add(robotLine);
        // v.2
//        RobotLine robotLine1 = new RobotLine();
//        robotLine1.setOldX(templX);
//        robotLine1.setOldY(templY);
//        robotLine1.setNewX(x);
//        robotLine1.setNewY(y);
//        robotLines.add(robotLine1);
        // v.3
        robotLines.add(new RobotLine(templX, templY, x, y));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot.toString());

        Robot robot1 = new Robot(5);
        Robot robot2 = new Robot(5, 5);
        Robot robot3 = new Robot(5, 5,100);
        Robot robot4 = new Robot(0, 0,100, 200);

        robot.setX(0);
        robot.setY(0);
        robot.setCourse(90);
        robot.setDistance(100);

        robot.forward();

        System.out.println(robot);

        robot.setCourse(90);
        robot.setDistance(200);

        robot.forward();
        System.out.println(robot);

        robot.course = 45;
        robot.distance = 300;

        robot.forward();

        System.out.println(robot);

    }
}
