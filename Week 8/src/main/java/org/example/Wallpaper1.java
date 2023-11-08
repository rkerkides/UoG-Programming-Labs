package org.example;

import java.awt.*;
import javax.swing.*;

public class Wallpaper1 extends JFrame {
    public Wallpaper1() {
// the usual JFrame stuff
        final int UNIT = 20;
        this.setLocation(20, 20);
        this.setTitle("Wallpaper1");
        this.setSize(30 * UNIT, 30 * UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 2));
// add FilledPanels to each position in the grid
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.red, Color.white, UNIT, UNIT, UNIT, UNIT, Color.white, Color.green));
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.white, Color.green, UNIT, UNIT, UNIT, UNIT, Color.green, Color.blue));
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.green, Color.blue, UNIT, UNIT, UNIT, UNIT, Color.blue, Color.yellow));
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.blue, Color.yellow, UNIT, UNIT, UNIT, UNIT, Color.yellow, Color.cyan));
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.yellow, Color.cyan, UNIT, UNIT, UNIT, UNIT, Color.cyan, Color.red));
        this.add(new TripleFilledPanel(UNIT, UNIT, UNIT, UNIT,
                Color.cyan, Color.red, UNIT, UNIT, UNIT, UNIT, Color.red, Color.white));
    }

    public static void main(String[] args) {
        Wallpaper1 gui = new Wallpaper1();
        gui.setVisible(true);
    }
}
