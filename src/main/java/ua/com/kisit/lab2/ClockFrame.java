package ua.com.kisit.lab2;

import javax.swing.*;
import java.awt.*;

public class ClockFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        label = new JLabel();

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 70);

        ClockExt clock = new ClockExt(14, 10,10);

        Timer timer = new Timer(1000, e -> {
            clock.nextSecond();
            label.setText(clock.toString());
        });

        timer.start();

        frame.setVisible(true);
    }
}
