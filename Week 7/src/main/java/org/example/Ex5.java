package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex5 extends JFrame {

    public Ex5() {
        setTitle("Border layout for JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setLayout(new BorderLayout());
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Font f = new Font("TimesRoman", Font.PLAIN, 24);

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        topPanel.setLayout(new GridBagLayout());
        bottomPanel.setLayout(new GridBagLayout());
        rightPanel.setLayout(new GridBagLayout());
        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());

        topPanel.setBorder(blackline);
        bottomPanel.setBorder(blackline);
        rightPanel.setBorder(blackline);
        leftPanel.setBorder(blackline);
        centerPanel.setBorder(blackline);

        Label north = new Label("North");
        Label south = new Label("South");
        Label east = new Label("East");
        Label west = new Label("West");
        Label center = new Label("Center");

        north.setFont(f);
        south.setFont(f);
        east.setFont(f);
        west.setFont(f);
        center.setFont(f);

        topPanel.add(north);
        bottomPanel.add(south);
        rightPanel.add(east);
        leftPanel.add(west);
        centerPanel.add(center);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        add(rightPanel, BorderLayout.EAST);
        add(leftPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        var frame = new Ex5();
        frame.setVisible(true);
    }
}
