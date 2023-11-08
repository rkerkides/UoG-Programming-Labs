package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TripleFilledPanel extends JPanel {
    public TripleFilledPanel(int nBorder1, int wBorder1, int sBorder1, int eBorder1, Color borderColor1, Color fillColor1,
                             int nBorder2, int wBorder2, int sBorder2, int eBorder2, Color borderColor2, Color fillColor2) {
        // Set the layout and the outermost border color
        this.setLayout(new BorderLayout());
        this.setBackground(borderColor1);

        // Create the outer border
        Border outerBorder = BorderFactory.createEmptyBorder(nBorder1, wBorder1, sBorder1, eBorder1);
        this.setBorder(outerBorder);

        // Create the first inner panel with the first fill color
        JPanel innerPanel1 = new JPanel(new BorderLayout());
        innerPanel1.setBackground(fillColor1);
        Border innerBorder1 = BorderFactory.createEmptyBorder(nBorder2, wBorder2, sBorder2, eBorder2);
        innerPanel1.setBorder(innerBorder1);

        // Create the second inner panel with the second fill color
        JPanel innerPanel2 = new JPanel();
        innerPanel2.setBackground(fillColor2);

        // Nest the panels
        innerPanel1.add(innerPanel2, BorderLayout.CENTER);

        // Add the first inner panel to this TripleFilledPanel
        this.add(innerPanel1, BorderLayout.CENTER);
    }
}
