package entities;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		int height = getHeight();
		
		for (int i = 0; i < 12; i++)
			g.drawOval(height/2 - i * 10, height/2 - i * 10, 10 + i * 10,  10 + i * 10);
	}

}
