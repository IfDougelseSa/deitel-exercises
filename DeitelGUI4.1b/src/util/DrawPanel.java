package util;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int steps = 0;

		while (steps <= width) {
			g.drawLine(0, 0, steps, width - steps);
			g.drawLine(width, height, steps, width-steps);
			g.drawLine(width, 0, width-steps, height-steps);
			g.drawLine(0, height, width-steps, height-steps);

			steps += 15;
		}

	}

}
