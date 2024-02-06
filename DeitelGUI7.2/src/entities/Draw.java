package entities;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel {
	private static final long serialVersionUID = 1L;

	public Draw() {
		setBackground(Color.GRAY);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = getSize().width / 2 - 10;
		int y = getSize().height / 2 - 10;
		int width = 20;
		int height = 20;
		int startAngle = 0;
		int arcAngle = 180;
		int depth = 10;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				// g.drawArc(x + 10, y + 10, width, height, startAngle + 10, -arcAngle);
				// x = x - 5;
				y = y - depth;
				width = width + 2 * depth;
				height = height + 2 * depth;
				g.drawArc(x, y, width, height, startAngle, -arcAngle);
			} else {
				// g.drawArc(x + 10, y + 10, width, height, startAngle + 10, arcAngle);
				x = x - 2 * depth;
				y = y - depth;
				width = width + 2 * depth;
				height = height + 2 * depth;
				g.drawArc(x, y, width, height, startAngle, arcAngle);
			}
		}

	}

}
