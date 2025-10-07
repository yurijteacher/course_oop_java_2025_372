package ua.com.kisit.unit5._public;


public class RobotPublic {
    public double x = 0;
    public double y = 0;
    public double course = 0;
    public double distance = 0;

    public RobotPublic() {
    }

    public RobotPublic(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public static void main(String[] args) {
        RobotPublic robot = new RobotPublic();
        robot.x = 10;
        robot.y = 20;
        robot.course = 90;
        robot.distance = 100;

    }


}
