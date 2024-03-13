package application;

import javax.swing.JFrame;

import entities.Draw;

public class Program {

	public static void main(String[] args) {
	
		
		
		Draw panel = new Draw();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);

	}

}
