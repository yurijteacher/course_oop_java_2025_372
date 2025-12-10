package ua.com.kisit.unit10.design_patterns.creational_patterns.abstract_factory;

public abstract class Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public abstract void forward();


    public Robot() {
    }

    public Robot(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", head=" + head +
                '}';
    }
}
