package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex7 extends JFrame {

    public Ex7() {
        setTitle("Border layout for JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);

        BorderPanel myPanel = new BorderPanel();
        this.add(myPanel);
    }


    public static void main(String[] args) {
        var frame = new Ex7();
        frame.setVisible(true);
    }
}
