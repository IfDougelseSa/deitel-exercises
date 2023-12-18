package application;

import javax.swing.JFrame;

import entities.Circle;

public class Program {

	public static void main(String[] args) {

		
		Circle panel = new Circle();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
