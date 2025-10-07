package ua.com.kisit.unit5.base;

public class RobotManager {


    public static void main(String[] args) {

        Robot robot = new Robot();
//        robot.x = 5;
//        robot.y = 10;
//        robot.course = 12;
//        robot.distance = 100;

        robot.setX(1000);

        System.out.println(robot);

        System.out.println(robot.getX());

        Robot robot2 = new Robot(111,222);
        System.out.println(robot2);

        Robot robot3 = new Robot(111,222,333);
        System.out.println(robot3);

        Robot robot4 = new Robot(101,202,303,404);
        System.out.println(robot4);

        robot4.setX(202);

        System.out.println(robot4);

        robot4.setY(303);
        robot4.setCourse(90);
        robot4.setDistance(2000);

        System.out.println(robot4);



    }



}
