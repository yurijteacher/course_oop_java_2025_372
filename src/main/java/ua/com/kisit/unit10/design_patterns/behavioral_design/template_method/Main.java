package ua.com.kisit.unit10.design_patterns.behavioral_design.template_method;

public class Main {

    public static void main(String[] args) {

        Football football = new Football();
        football.initialize();
        football.play();
        football.stop();


        Basketball basketball = new Basketball();
        basketball.initialize();
        basketball.play();
        basketball.stop();


    }

}
