package ua.com.kisit.unit9.generalization;

public class RobotExt extends Robot {

    private double totalDistance = 0;


    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance, double totalDistance) {
        super(x, y, course, distance);
        this.totalDistance = totalDistance;
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
//        robotExt.x = 0;
//        robotExt.y = 0;
        robotExt.setX(100);
        robotExt.setY(100);
        robotExt.setCourse(45);
        robotExt.setDistance(300);
        robotExt.forward();

//        robotExt.speed = 100;

        System.out.println(robotExt);

        robotExt.course = 90;
        robotExt.distance = 300;
        robotExt.forward();
        System.out.println(robotExt);

        RobotExt robotExt2 = new RobotExt(0,0,0,0,0);
        robotExt2.setCourse(90);
        robotExt2.setDistance(100);
        robotExt2.forward();
        System.out.println(robotExt2);

        robotExt2.setCourse(90);
        robotExt2.setDistance(100);
        robotExt2.forward();
        System.out.println(robotExt2);

        robotExt2.setCourse(45);
        robotExt2.setDistance(300);
        robotExt2.forward();
        System.out.println(robotExt2);

        System.out.println(robotExt2.getRobotLines());
        for(RobotLine el : robotExt2.getRobotLines()){
            System.out.println(el);
        }


    }

    @Override
    public String toString() {
        return super.toString() + ", totalDistance=" + totalDistance;
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += distance;
    }


}
