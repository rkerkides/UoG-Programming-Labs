package org.example;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame {
    private Label north = new Label("North");
    private Label south = new Label("South");
    private Label east = new Label("East");
    private Label west = new Label("West");
    private Label center = new Label("Center");

    public Ex1() {
        setTitle("Border layout for JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setLayout(new BorderLayout());
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        var frame = new Ex1();
        frame.setVisible(true);
    }
}