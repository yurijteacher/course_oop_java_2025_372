package ua.com.kisit.lab2.my_clock;

import java.util.Calendar;
import java.util.TimerTask;

public class MyClock extends TimerTask {

    @Override
    public void run() {

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("MyClock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}');
    }



}
