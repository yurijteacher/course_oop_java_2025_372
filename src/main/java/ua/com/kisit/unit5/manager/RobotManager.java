package ua.com.kisit.unit5.manager;

import ua.com.kisit.unit5._default.RobotDefault;
import ua.com.kisit.unit5._private.RobotPrivateVar;
import ua.com.kisit.unit5._protected.RobotBase;
import ua.com.kisit.unit5._public.RobotPublic;

public class RobotManager {

    public static void main(String[] args) {

        RobotDefault robot = new RobotDefault();
//        robot.x = 0;
//        robot.y = 0;

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 0;
        robotPublic.y = 0;

        RobotPrivateVar robotPrivateVar = new RobotPrivateVar();

//        robotPrivateVar.x = 90;
//        robotPrivateVar.y = 10;

        RobotBase robotBase = new RobotBase();
//        robotBase.x = 0;


    }


}
