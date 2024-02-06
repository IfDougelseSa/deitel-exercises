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
		g.setColor(Color.RED);
		int line1 = 290;
		int line2 = 20;
		int line3 = 270;

		for (int i = 1; i <= 3; i++) {

			g.drawLine(line1, line1, line1, line2);
			g.drawLine(line1, line2, line2, line2);
			g.drawLine(line2, line2, line2, line3);
			g.drawLine(line2, line3, line3, line3);
			line1 -= 20;
			line2 += 40;
			line3 -= 20;
		}
		g.drawLine(line1, line1, line1, line2);
//		g.drawLine(290, 290, 290, 20);
//		g.drawLine(290, 20, 20, 20);
//		g.drawLine(20, 20, 20, 270);
//		g.drawLine(20, 270, 270, 270);
//		
//		g.drawLine(270, 270, 270, 40);
//		g.drawLine(270, 40, 40, 40);
//		g.drawLine(40, 40, 40, 250);
//		g.drawLine(40, 250, 250, 250);

	}

}
