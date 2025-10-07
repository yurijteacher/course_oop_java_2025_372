package ua.com.kisit.unit5._default;

public class RobotDefault {

    double x = 0;
    double y = 0;
    double course = 0;
    double distance = 0;

    public RobotDefault() {
    }

    public RobotDefault(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public static void main(String[] args) {
        RobotDefault robot = new RobotDefault();
        robot.x = 10;
        robot.y = 20;
        robot.course = 90;
        robot.distance = 100;

    }
}
