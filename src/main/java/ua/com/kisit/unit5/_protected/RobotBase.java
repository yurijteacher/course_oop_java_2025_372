package ua.com.kisit.unit5._protected;

public class RobotBase {

    protected double x = 0;
    protected double y = 0;
    protected double course = 0;
    protected double distance = 0;

    public RobotBase() {
    }

    public RobotBase(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotBase{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotBase robotBase = new RobotBase();
        robotBase.x = robotBase.y = robotBase.course = robotBase.distance = 5;
        System.out.println(robotBase);

    }
}
