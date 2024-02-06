package application;

import javax.swing.JFrame;

import entities.Draw;

public class DrawTest {

	public static void main(String[] args) {
		{
			 Draw panel = new Draw();
			 JFrame application = new JFrame();
			
			 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 application.add(panel);
			 application.setSize(500, 500);
			 application.setVisible(true);
			 } 

	}

}
