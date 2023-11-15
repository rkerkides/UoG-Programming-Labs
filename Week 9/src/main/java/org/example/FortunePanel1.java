package org.example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FortunePanel1 extends JPanel {

	private JButton button1;
	private JTextField text;
	private Random randomGenerator;

	public FortunePanel1() {
		super(new BorderLayout());
		randomGenerator = new Random();
		text = new JTextField("Your fortune will appear here!");
		text.setEditable(false);
		this.add(text, BorderLayout.SOUTH);

		button1 = new JButton("Tell me my fortune!");
		this.add(button1, BorderLayout.CENTER);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> fortunes = new ArrayList<>();
				try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/fortunes.txt"))) {
					String line;
					while ((line = reader.readLine()) != null) {
						fortunes.add(line);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					updateText("An error occurred while reading fortunes");
					return;
				}
				String randomFortune = fortunes.get(randomGenerator.nextInt(fortunes.size()));
				updateText(randomFortune);
			}
		});
	}

	public void updateText(String s){
		text.setText(s);
	}
}
