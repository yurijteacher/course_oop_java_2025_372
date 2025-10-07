package ua.com.kisit.lab2;

public class ClockExt extends Clock{

    private int second;

    public ClockExt() {
    }

    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public void nextSecond() {
        second++;

        if(second > 59){
            second = 0;
            super.nextMinute();
        }
//        minute++;
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + second +
                '}';
    }
}
