package ua.com.kisit.unit10.design_patterns.behavioral_design.state;

public abstract class State {

    Player player;

    public State(Player player) {
        this.player = player;
    }


    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
