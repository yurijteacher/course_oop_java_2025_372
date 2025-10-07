package ua.com.kisit.unit5.base;

public class Robot {

    private double x=0;
    private double y=0;
    private double course = 45;
    private double distance = 100;


    // get / set
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
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

//    public Robot(double distance, double course) {
//        this.distance = distance;
//        this.course = course;
//    }

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
        return "x: " + x + ", y: "+ y + ", course: " + course + ", distance: " + distance;

    }


    public static void main(String[] args) {

        Robot robot;
         robot = new Robot();

        System.out.println(robot.toString());

        robot.x = 5;
        robot.y = 5;
        robot.course = 45;
        robot.distance = 100;

        System.out.println(robot);
        //
        Robot robot2 = new Robot();



    }


}
