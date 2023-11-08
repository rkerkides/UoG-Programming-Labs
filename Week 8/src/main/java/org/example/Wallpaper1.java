package org.example;

import java.awt.*;
import javax.swing.*;

public class Wallpaper1 extends JFrame {
    public Wallpaper1() {
// the usual JFrame stuff
        final int small = 10;
        final int medium = 25;
        final int large = 40;
        this.setLocation(20, 20);
        this.setTitle("Battleships");
        this.setSize(30 * large, 30 * large);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 2));
// add FilledPanels to each position in the grid
        this.add(new TripleFilledPanel(small, small, small, small,
                Color.black, Color.black, small, small, small, small, Color.gray, Color.gray));
        this.add(new TripleFilledPanel(small, small, small, small,
                Color.black, Color.black, small, small, small, small, Color.gray, Color.gray));
        this.add(new TripleFilledPanel(small, small, small, small,
                Color.black, Color.black, small, small, small, small, Color.gray, Color.gray));
        this.add(new TripleFilledPanel(medium, medium, medium, medium,
                Color.black, Color.black, medium, medium, medium, medium, Color.gray, Color.gray));
        this.add(new TripleFilledPanel(medium, medium, medium, medium,
                Color.black, Color.black, medium, medium, medium, medium, Color.gray, Color.gray));
        this.add(new TripleFilledPanel(large, large, large, large,
                Color.black, Color.black, large, large, large, large, Color.gray, Color.gray));
    }

    public static void main(String[] args) {
        Wallpaper1 gui = new Wallpaper1();
        gui.setVisible(true);
    }
}
