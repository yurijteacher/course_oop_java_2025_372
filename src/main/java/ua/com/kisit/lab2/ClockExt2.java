package ua.com.kisit.lab2;

public class ClockExt2 extends ClockExt {

    private int millisecond;

    public ClockExt2() {
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    public void newMillisecond(){

        millisecond+=100;

        if(millisecond > 1000){
            nextSecond();
            millisecond = 0;
        }
    }

    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + getSecond() +
                ", millisecond=" + millisecond +
                '}';
    }
}
