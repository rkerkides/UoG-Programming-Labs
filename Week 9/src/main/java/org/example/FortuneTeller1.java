package org.example;

import javax.swing.JFrame;

public class FortuneTeller1 extends JFrame {
	
private FortunePanel1 mainPanel;

	public FortuneTeller1() {
		setSize(300,300);
		setLocation(20,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new FortunePanel1();
		add(mainPanel);
	}

	public static void main(String[] args) {
		FortuneTeller1 gui =  new FortuneTeller1();
		gui.setVisible(true);

	}

}
