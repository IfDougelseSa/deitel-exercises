package util;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();

		int steps = 0;

		while (steps <= width) {
			g.drawLine(0, 0, steps, width - steps);
			steps += 15;
		}

	}

}
