package application;

import javax.swing.JFrame;

import entities.DrawCircle;

public class Program {

	public static void main(String[] args) {

		DrawCircle panel = new DrawCircle();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);

	}

}
