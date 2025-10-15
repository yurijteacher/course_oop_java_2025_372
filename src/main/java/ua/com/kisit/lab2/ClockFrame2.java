package ua.com.kisit.lab2;

import javax.swing.*;
import java.awt.*;

public class ClockFrame2 {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame2() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        label = new JLabel();

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 70);

        label.setFont(new Font("Arial", Font.BOLD, 20));

        ClockExt2 clock = new ClockExt2(14, 10,10, 100);

        Timer timer = new Timer(100, e -> {
            clock.newMillisecond();
            label.setText(clock.toString());
        });

        timer.start();

        frame.setVisible(true);
    }

}
